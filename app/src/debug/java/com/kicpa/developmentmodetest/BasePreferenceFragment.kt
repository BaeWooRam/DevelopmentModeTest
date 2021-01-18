package com.kicpa.developmentmodetest

import android.os.Bundle
import android.preference.PreferenceFragment

class BasePreferenceFragment: androidx.preference.PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.setting)
    }
}