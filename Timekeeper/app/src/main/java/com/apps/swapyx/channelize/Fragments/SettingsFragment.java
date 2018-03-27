package com.apps.swapyx.channelize.Fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.apps.swapyx.channelize.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.app_prefs);
    }
}
