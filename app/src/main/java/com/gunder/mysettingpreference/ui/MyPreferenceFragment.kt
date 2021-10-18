package com.gunder.mysettingpreference.ui

import android.os.Bundle
import androidx.preference.CheckBoxPreference
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
    private lateinit var islovemuPreference: CheckBoxPreference

    companion object {
        private const val DEFAULT_VALUE = "tidak tersedia"
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, s: String?) {
        addPreferencesFromResource(R.xml.preference)
        init()
        setSummaries()
    }

    private fun setSummaries() {
        val sh = preferenceManager.sharedPreferences
        namePreference.summary = sh.getString(NAME, DEFAULT_VALUE)
        emailPreference.summary = sh.getString(EMAIL, DEFAULT_VALUE)
        agePreference.summary = sh.getString(AGE, DEFAULT_VALUE)
        phonePreference.summary = sh.getString(PHONE, DEFAULT_VALUE)
        islovemuPreference.isChecked = sh.getBoolean(LOVE, false)
    }

    private fun init() {
        NAME = resources.getString(R.string.key_name)
        EMAIL = resources.getString(R.string.key_email)
        AGE = resources.getString(R.string.key_age)
        PHONE = resources.getString(R.string.key_phone)
        LOVE = resources.getString(R.string.key_love)

        namePreference = findPreference<EditTextPreference>(NAME) as EditTextPreference
        emailPreference = findPreference<EditTextPreference>(EMAIL) as EditTextPreference
        agePreference = findPreference<EditTextPreference>(AGE) as EditTextPreference
        phonePreference = findPreference<EditTextPreference>(PHONE) as EditTextPreference
        islovemuPreference = findPreference<CheckBoxPreference>(LOVE) as CheckBoxPreference
    }
}