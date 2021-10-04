package com.test.uranai_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.uranaiTV)
        val btn: Button  = findViewById(R.id.uranaiBtn)

        btn.setOnClickListener {

            val uranai = arrayOf("大吉","中吉","小吉","凶")
            val num = Random().nextInt(uranai.count())

            tv.text =uranai.get(num)
        }

    }
}