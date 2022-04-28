package com.nissy.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countUp: Button =findViewById(R.id.countUp)
        val textViewNumber: TextView =findViewById(R.id.diceNumber)
        val buttonRoll :Button =findViewById(R.id.btnRoll)

        var generateRandomNumber = Random.nextInt(0,6)


        fun rollDice(){
            textViewNumber.text = generateRandomNumber.toString()


        }
        fun countingUp(){
            var news = textViewNumber.text.toString().toInt()+1
            textViewNumber.text = news.toString()
        }


        buttonRoll.setOnClickListener {
            rollDice()
        }

        countUp.setOnClickListener {
            countingUp()
        }


    }
}