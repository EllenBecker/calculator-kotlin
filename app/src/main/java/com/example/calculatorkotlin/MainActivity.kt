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

            var soma = number1Double.plus(number2Double);
            var div = number1Double.div(number2Double);
            var mult = number1Double.times(number2Double);
            var menos = number1Double.minus(number2Double);

            Snackbar.make(view, "Soma: " + soma.toString() + "| Divisão: " + div.toString() + "| Multiplicação: " + mult.toString()+ "| Subtração: " + menos.toString(),
                Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()

        }

    }
}