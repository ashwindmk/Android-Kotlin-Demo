package com.example.ashwin.androidkotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        next.setOnClickListener { goNext() }
    }

    private fun goNext() {
        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name", nameField.text.toString())
        startActivity(intent)
        finish()
    }
}
