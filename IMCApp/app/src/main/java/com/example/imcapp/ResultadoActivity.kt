package com.example.imcapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.getStringExtra("peso")?.toFloatOrNull() ?: 0f
        val altura = intent.getStringExtra("altura")?.toFloatOrNull() ?: 0f
        val imc = peso / (altura * altura)

        val txtPeso = findViewById<TextView>(R.id.txtPeso)
        val txtAltura = findViewById<TextView>(R.id.txtAltura)
        val txtIMC = findViewById<TextView>(R.id.txtIMC)
        val txtClassificacao = findViewById<TextView>(R.id.txtClassificacao)

        txtPeso.text = "Peso: %.2f kg".format(peso)
        txtAltura.text = "Altura: %.2f m".format(altura)
        txtIMC.text = "IMC: %.2f".format(imc)

        txtClassificacao.text = when {
            imc < 18.5 -> "Abaixo do peso"
            imc < 25 -> "Peso normal"
            imc < 30 -> "Sobrepeso"
            else -> "Obesidade"
        }
    }
}
