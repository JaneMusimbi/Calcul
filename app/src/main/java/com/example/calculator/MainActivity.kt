package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnADD: Button
    lateinit var btnSub: Button
    lateinit var btnMult: Button
    lateinit var btnModul: Button
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tvresult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnADD = findViewById(R.id.btnADD)
        btnSub = findViewById(R.id.btnSubtract)
        btnMult = findViewById(R.id.btnMultiply)
        btnModul = findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber1)
        tvresult = findViewById(R.id.tvresults)

        btnADD.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var number2 = etNumber2.text.toString().toInt()
            calculateaddition(number1 ,number2)
        }
        btnSub.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var number2 = etNumber2.text.toString().toInt()
            calculateSubtraction(number1 ,number2)
        }
        btnMult.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var number2 = etNumber2.text.toString().toInt()
            calculateMultiplication(number1 ,number2)
        }
        btnModul.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var number2 = etNumber2.text.toString().toInt()
            calculateModulus    (number1 ,number2)

        }
    }
    fun calculateaddition(Number1: Int, Number2: Int) {
        var addition = Number1 + Number2
        tvresult.text = addition.toString()
    }

    fun calculateSubtraction(Number1: Int, Number2: Int) {
        var subtract  = Number1 - Number2
        tvresult.text = subtract.toString()
    }

    fun calculateMultiplication(Number1: Int, Number2: Int) {
        var multiple = Number1 * Number2
        tvresult.text = multiple.toString()
    }

    fun calculateModulus(Number1: Int, Number2: Int) {
        var modulus = Number1 % Number2
        tvresult.text = modulus.toString()

    }
}