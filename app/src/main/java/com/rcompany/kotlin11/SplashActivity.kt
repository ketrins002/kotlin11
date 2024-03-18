package com.rcompany.kotlin11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        // По истечении трех секунд переходим на главный экран
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))   // Переходим на MainActivity
            finish()    // Завершаем работу данного экрана
        }, 3000)    // Запускаем таймер в 3 секунды
    }
}