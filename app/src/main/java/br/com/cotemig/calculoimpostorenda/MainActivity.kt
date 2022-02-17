package br.com.cotemig.calculoimpostorenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var salario = findViewById<EditText>(R.id.salario)
        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        var salarioLiquido = findViewById<TextView>(R.id.salarioLiquido)
        var imposto = findViewById<TextView>(R.id.imposto)

        btnCalcular.setOnClickListener {
            salarioLiquido.text = salario.text
        }


    }
}