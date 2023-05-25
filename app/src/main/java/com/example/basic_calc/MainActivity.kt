package com.example.basic_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.get
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNumbers = findViewById<TextView>(R.id.tvNumbers)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        findViewById<Button>(R.id.zero).setOnClickListener{
            tvNumbers.append("0")
        }
        findViewById<Button>(R.id.one).setOnClickListener{
            tvNumbers.append("1")
        }
        findViewById<Button>(R.id.two).setOnClickListener{
            tvNumbers.append("2")
        }
        findViewById<Button>(R.id.three).setOnClickListener{
            tvNumbers.append("3")
        }
        findViewById<Button>(R.id.four).setOnClickListener{
            tvNumbers.append("4")
        }
        findViewById<Button>(R.id.five).setOnClickListener{
            tvNumbers.append("5")
        }
        findViewById<Button>(R.id.six).setOnClickListener{
            tvNumbers.append("6")
        }
        findViewById<Button>(R.id.seven).setOnClickListener{
            tvNumbers.append("7")
        }
        findViewById<Button>(R.id.eight).setOnClickListener{
            tvNumbers.append("8")
        }
        findViewById<Button>(R.id.nine).setOnClickListener{
            tvNumbers.append("9")
        }

        findViewById<Button>(R.id.minus).setOnClickListener{
            tvNumbers.append("-")
        }
        findViewById<Button>(R.id.plus).setOnClickListener{
            tvNumbers.append("+")
        }
        findViewById<Button>(R.id.multiply).setOnClickListener{
            tvNumbers.append("*")
        }
        findViewById<Button>(R.id.divide).setOnClickListener{
            tvNumbers.append("/")
            print("newText")
        }
        findViewById<Button>(R.id.dot).setOnClickListener{
            tvNumbers.append(".")
        }
        findViewById<Button>(R.id.reset).setOnClickListener{
            tvNumbers.text = ""
            tvResult.text = ""
        }
        findViewById<Button>(R.id.del).setOnClickListener{
            val txt = tvNumbers.text.toString()
            val newText = txt.substring(0,txt.length-1)

            tvNumbers.text = newText
        }

        findViewById<Button>(R.id.result).setOnClickListener{
            val eval = ExpressionBuilder(tvNumbers.text.toString()).build()
            val res =eval.evaluate()
            tvResult.text = res.toString()
        }



    }
}