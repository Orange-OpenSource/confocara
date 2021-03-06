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

package com.orange.confocara.common.binding;

public class BizPreconditionFailedException extends BizException {

    public BizPreconditionFailedException(String message) {
        super(ErrorCode.INVALID, message);
    }

    public BizPreconditionFailedException() {
        super(ErrorCode.INVALID);
    }
}
