package com.gunder.mysettingpreference.ui

import android.os.Bundle
import androidx.preference.EditTextPreference
import androidx.preference.PreferenceFragmentCompat
import com.gunder.mysettingpreference.R

class MyPreferenceFragment : PreferenceFragmentCompat() {
    private lateinit var NAME: String
    private lateinit var EMAIL: String
    private lateinit var AGE: String
    private lateinit var PHONE: String
    private lateinit var LOVE: String

    private lateinit var namePreference: EditTextPreference
    private lateinit var emailPreference: EditTextPreference
    private lateinit var agePreference: EditTextPreference
    private lateinit var phonePreference: EditTextPreference
    private lateinit var islovemuPreference: EditTextPreference

    companion object {
        private const val DEFAULT_VALUE = "tidak tersedia"
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, s: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}