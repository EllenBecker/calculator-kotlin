package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bntClicked = findViewById(R.id.button) as Button
        bntClicked.setOnClickListener { view ->
            var number1 = findViewById(R.id.editTextNumberDecimal) as EditText;
            var number2 = findViewById(R.id.editTextNumberDecimal2) as EditText;

            val number1Double = number1.text.toString().toDouble();

            val number2Double = number2.text.toString().toDouble();

            var sum = sumNumbers(number1Double,number2Double);
            var div = divNumbers(number1Double,number2Double);
            var mult = multNumbers(number1Double,number2Double);
            var sub = subNumbers(number1Double,number2Double);

            Snackbar.make(view, "Soma: " + sum + "| Divisão: " + div + "| Multiplicação: " + mult + "| Subtração: " + sub,
                Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()

        }

    }
    fun sumNumbers(number1: Double,number2:Double): String {
        return number1.plus(number2).toString();
    }

    fun divNumbers(number1: Double,number2:Double): String {
        return number1.div(number2).toString();
    }

    fun multNumbers(number1: Double,number2:Double): String {
        return number1.times(number2).toString();
    }

    fun subNumbers(number1: Double,number2:Double): String {
        return number1.minus(number2).toString();
    }

}