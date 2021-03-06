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

package com.orange.confocara.presentation.webservice.qo;

/**
 * Behaviour of a data transfer object for questionnaires and their ruleset
 */
interface RulesetQuestionnaireEnhancedDto {

    Long getRulesetId();

    String getRulesetName();

    String getRulesetReference();

    Long getQuestionnaireId();

    String getQuestionnaireName();

    String getQuestionnaireReference();
}
