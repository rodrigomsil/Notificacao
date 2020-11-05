package com.example.notificao

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val i = intent
        val nome  = i.getStringExtra("nome")
        campo.text = nome


        val editor = SharedPreferences
        val nome2  = editor.getString("nome2")
        campo2.text = nome





    }
}