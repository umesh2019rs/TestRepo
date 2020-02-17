package com.example.demokotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.Activities.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    // This is the loading time of the splash screen
    // New changes from git side
    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this , LoginActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}
