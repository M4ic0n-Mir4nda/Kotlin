package com.example.appemptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acaoBotao(view: View) {
        var caixaDeTesto = findViewById<TextView>(R.id.textView)
        var numeroSorteado = Random.nextInt(11)

        caixaDeTesto.setText("O número sorteado é $numeroSorteado")
    }
}