package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var textViewEquation: TextView
    private var equation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewEquation = findViewById(R.id.textViewEquation)
    }

    fun onButtonClick(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()
        equation += buttonText
        textViewEquation.text = equation
    }

    fun onClearClick(view: View) {
        equation = ""
        textViewEquation.text = equation
    }

    fun onEqualsClick(view: View) {
        try {
            val result = evaluateExpression(equation)
            equation = result.toString()
            textViewEquation.text = equation
        } catch (e: Exception) {
            showErrorMessage("Operação inválida")
        }
    }

    fun onBackspaceClick(view: View) {
        if (equation.isNotEmpty()) {
            equation = equation.substring(0, equation.length - 1)
            textViewEquation.text = equation
        }
    }

    private fun evaluateExpression(expression: String): Double {
        return try {
            ExpressionBuilder(expression).build().evaluate()
        } catch (e: ArithmeticException) {
            throw Exception("Divisão por zero")
        } catch (e: Exception) {
            throw Exception("Operação inválida")
        }
    }

    private fun showErrorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
