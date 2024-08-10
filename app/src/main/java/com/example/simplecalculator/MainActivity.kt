package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                tvResult.text = (num1 + num2).toString()
            } else {
                tvResult.text = "Invalid input"
            }
        }

        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                tvResult.text = (num1 - num2).toString()
            } else {
                tvResult.text = "Invalid input"
            }
        }

        btnMultiply.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                tvResult.text = (num1 * num2).toString()
            } else {
                tvResult.text = "Invalid input"
            }
        }

        btnDivide.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    tvResult.text = (num1 / num2).toString()
                } else {
                    tvResult.text = "Cannot divide by zero"
                }
            } else {
                tvResult.text = "Invalid input"
            }
        }
    }
}