package com.example.mysunflowerapp_d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActividadDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_dos)

    val ss:String = intent.getStringExtra("TEXTO").toString()
        var mensaje: TextView = findViewById(R.id.mensaje)
        mensaje.text= ss
    }
}