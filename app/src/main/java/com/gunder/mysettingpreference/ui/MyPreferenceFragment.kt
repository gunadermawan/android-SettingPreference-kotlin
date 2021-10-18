package com.gunder.mysettingpreference.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.gunder.mysettingpreference.R

class MyPreferenceFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, s: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}