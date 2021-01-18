package com.kicpa.developmentmodetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DevelopmentModeActivity:AppCompatActivity(R.layout.activity_development_mode) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, BasePreferenceFragment())
            .commit()
    }
}