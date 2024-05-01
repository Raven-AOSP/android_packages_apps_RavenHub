/*
 * Copyright (C) 2026 Raven AOSP
 * SPDX-License-Identifier: Apache-2.0
 */

package org.raven.settings;

import android.content.Context;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class TopLevelRavenSettingsPreferenceController extends BasePreferenceController {

    public TopLevelRavenSettingsPreferenceController(Context context,
            String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }
}
