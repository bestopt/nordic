package com.example.classwork20_22_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.*
import com.example.classwork20_22_07.chat.SecondActivity
import com.example.classwork20_22_07.main.MainActivity
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        btnStr1.setOnClickListener(this)
        btnStr2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnStr1 -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.btnStr2 -> {
                val intent  = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
