package com.example.demokotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.Activities.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {


    //Added comment in master 2
    //Added cooment in master 1
    //Added comment in feature_3
    //Added comment in feature_2
    //Added comment in master
    //Added comment in feature_1
    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     
        Handler().postDelayed({
            startActivity(Intent(this , LoginActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}
