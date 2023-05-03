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

            val sum = sumNumbers(number1Double,number2Double);
            val div = divNumbers(number1Double,number2Double);
            val mult = multNumbers(number1Double,number2Double);
            val sub = subNumbers(number1Double,number2Double);

            val message = "Soma: ${sum.toString()} " +
                    "| Divisão: ${div.toString()} " +
                    "| Multiplicação: ${mult.toString()} " +
                    "| Subtração: ${sub.toString()}"
            Snackbar.make(view, message,
                Snackbar.LENGTH_INDEFINITE
            ).setAction("Action", null).show()

        }

    }
    fun sumNumbers(number1: Double,number2:Double): Double {
        return number1.plus(number2);
    }

    fun divNumbers(number1: Double,number2:Double): Double {
        return number1.div(number2);
    }

    fun multNumbers(number1: Double,number2:Double): Double {
        return number1.times(number2);
    }

    fun subNumbers(number1: Double,number2:Double): Double {
        return number1.minus(number2);
    }

}