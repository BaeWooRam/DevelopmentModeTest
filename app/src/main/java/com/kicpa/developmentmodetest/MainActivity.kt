package com.kicpa.developmentmodetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView(){
        if(BuildConfig.DevelopMode != null) {
            btDevelopmentMode.visibility = View.VISIBLE
        }else{
            btDevelopmentMode.visibility = View.GONE
        }

        btDevelopmentMode.setOnClickListener {
            val intent = Intent(this, BuildConfig.DevelopMode)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }
}