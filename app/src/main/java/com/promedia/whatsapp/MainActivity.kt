package com.promedia.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.promedia.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setLogo(R.drawable.ic_camara)



    }

}

//val toolbar: Toolbar = findViewById(R.id.toolbar)
//toolbar!!.title = "Mi Toolbar"
//toolbar.subtitle = "Diseñando el Toolbar"
//toolbar.setLogo(R.drawable.ic_abejita2)