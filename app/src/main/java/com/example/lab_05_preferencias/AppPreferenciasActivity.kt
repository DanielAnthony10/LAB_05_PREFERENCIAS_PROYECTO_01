package com.example.lab_05_preferencias

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AppPreferenciasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, AppPreferenciasFragment())
            .commit()

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}