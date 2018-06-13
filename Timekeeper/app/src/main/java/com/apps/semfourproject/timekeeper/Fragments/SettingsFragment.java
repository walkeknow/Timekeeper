package com.apps.semfourproject.timekeeper.Fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.apps.semfourproject.timekeeper.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.app_prefs);
    }
}
