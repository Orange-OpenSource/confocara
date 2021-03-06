/*
 * Software Name: ConfOCARA
 *
 * SPDX-FileCopyrightText: Copyright (c) 2016-2020 Orange
 * SPDX-License-Identifier: MPL-2.0
 *
 * This software is distributed under the Mozilla Public License v. 2.0,
 * the text of which is available at http://mozilla.org/MPL/2.0/ or
 * see the "license.txt" file for more details.
 *
 */

package com.orange.confocara.connector.persistence.repository;

import com.orange.confocara.connector.persistence.model.Subject;
import com.orange.confocara.connector.persistence.repository.utils.GeneratorUtil;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles(profiles = "test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SubjectRepositoryFilterWithNameIT {

    @Autowired
    private SubjectRepository subjectRepository;

    @Before
    public void initialize() {
        GeneratorUtil.saveSubject("sub", subjectRepository);
        GeneratorUtil.saveSubject("subject", subjectRepository);
    }

    @Test
    public void shouldReturn2SubjectsFilterWithNameSubWhenDBContains2SubjectsContainingThisName() {
        List<Subject> subjects = subjectRepository.filterWithName("sub");
        Assert.assertTrue(subjects.size() == 2);
    }

    @Test
    public void shouldReturn1SubjectFilterWithNameSubjWhenDBContains1SubjectContainingThisName() {
        List<Subject> subjects = subjectRepository.filterWithName("subj");
        Assert.assertTrue(subjects.size() == 1);
    }

    @Test
    public void shouldReturn0SubjectWhenDBContains0SubjectWithThisName() {
        List<Subject> subjects = subjectRepository.filterWithName("hello");
        Assert.assertTrue(subjects.size() == 0);
    }

    @Test
    public void shouldReturn2SubjectsFilterWithEmptyFilterWhenDBContains2Subjects() {
        List<Subject> subjects = subjectRepository.filterWithName("");
        Assert.assertTrue(subjects.size() == 2);
    }
}
