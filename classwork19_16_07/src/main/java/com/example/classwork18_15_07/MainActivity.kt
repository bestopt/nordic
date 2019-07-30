package com.example.classwork18_15_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransient = fragmentManager.beginTransaction()

        val emptyFragment = EmptyFragment()
        fragmentTransient.add(R.id.main_activity_conteiner, emptyFragment)
        fragmentTransient.commit()
    }
}

