package com.shong.aarlibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.shong.examplecal.FloatCalculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<TextView>(R.id.aText).text.toString().toFloat()
        val b = findViewById<TextView>(R.id.bText).text.toString().toFloat()

        findViewById<Button>(R.id.plusButton).btnClick{
            it.text = FloatCalculator.plus(a, b).toString()
        }
        findViewById<Button>(R.id.minusButton).btnClick{
            it.text = FloatCalculator.minus(a, b).toString()
        }
        findViewById<Button>(R.id.mulButton).btnClick{
            it.text = FloatCalculator.mul(a, b).toString()
        }
        findViewById<Button>(R.id.divButton).btnClick{
            it.text = FloatCalculator.div(a, b).toString()
        }
    }

    private var toast : Toast? = null
    private inline fun <reified T : Button> T.btnClick(crossinline oper : (T) -> Unit){
        this.setOnClickListener {
            oper(this)
            toast?.cancel()
            toast = Toast.makeText(this@MainActivity,"${this.text} Click!", Toast.LENGTH_SHORT)
            toast?.show()
        }
    }
}