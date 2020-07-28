package com.i.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("commit one")
        println("commit two")
        println("commit three")

        println("commit one")
        println("commit two")
    
        println("Test code to develop")
    }
}
