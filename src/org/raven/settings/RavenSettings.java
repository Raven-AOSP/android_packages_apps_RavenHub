/*
 * Copyright (C) 2026 Raven AOSP
 * SPDX-License-Identifier: Apache-2.0
 */

package org.raven.settings;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.dashboard.DashboardFragment;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settingslib.search.SearchIndexable;

@SearchIndexable
public class RavenSettings extends DashboardFragment {

    private static final String TAG = "RavenSettings";

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.raven_settings;
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.RAVEN_HUB;
    }

    @Override
    protected String getLogTag() {
        return TAG;
    }

    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
            new BaseSearchIndexProvider(R.xml.raven_settings);
}
