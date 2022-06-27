package com.ivkar.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivkar.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}