package com.example.imcapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString()
            val altura = edtAltura.text.toString()

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("peso", peso)
            intent.putExtra("altura", altura)
            startActivity(intent)
        }
    }
}
