package com.example.mysunflowerapp_d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color
import android.view.View
import android.widget.EditText

const val TEXTO = "Texto";

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var acceder: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        acceder = findViewById(R.id.button_mensaje)

        button.setOnClickListener {
            if (button.text != "Soy azul"){
                button.setBackgroundColor(Color.parseColor("#6495ED"));
                button.setText("Soy Azul");
            } else {
                button.setBackgroundColor(Color.parseColor("FF0000"));
                button.setText("Soy rojo");
            }
        }
        acceder.setOnClickListener{changeActivity(it)}; //mandar a llamar a través del botón acceder
    }

    fun changeActivity(view:View){  //Crear el método ChangeActivity
        var editText = findViewById<EditText>(R.id.Campo_texto);    //tomar los 2 widgets, con el método findViewById
        var Mensaje = editText.text.toString();                     //leer el texto del objeto "PlainText" y almacenarlo en la variable mensaje
        val intent = Intent(this, ActividadDos::class.java).apply{  //Crear objeto intent y colocar como parámetro la act. que se abrira
             putExtra("TEXTO",Mensaje)    //El método putExtra envía el texto a la act. mensaje
         }
        startActivity(intent);
    }

    fun verInventario(view: View){
        val intent = Intent(this, ActividadInventario::class.java).apply {  }
        startActivity(intent)
    }
}


