package com.korobeynikova.catr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onccreate(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.setings, menu)
        return true
    }
}