package com.example.notificao

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Avancar(view: View) {

        val valor1 = entrada1.text.toString()
        val i  = Intent(this, MainActivity2::class.java)
        i.putExtra("nome", valor1)
        startActivity(i)

        val valor2 = entrada2.text.toString()
        val sp = getPreferences ( 0)
        val editor = sp.edit()
        editor.putString("nome2", valor2)
        editor.apply()

    }
}