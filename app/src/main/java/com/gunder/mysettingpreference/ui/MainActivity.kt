package com.gunder.mysettingpreference.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gunder.mysettingpreference.R


class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.setting_holder, MyPreferenceFragment()).commit()
    }
}