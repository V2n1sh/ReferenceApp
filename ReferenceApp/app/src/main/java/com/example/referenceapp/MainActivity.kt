package com.example.referenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInfo: Button = findViewById(R.id.button_info)
        buttonInfo.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

        val buttonService: Button = findViewById(R.id.button_services)
        buttonService.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }

        val buttonContact: Button = findViewById(R.id.button_contact)
        buttonContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        val buttonProcess: Button = findViewById(R.id.button_process)
        buttonProcess.setOnClickListener {
            val intent = Intent(this, ProcessActivity::class.java)
            startActivity(intent)
        }

        val buttonPlus: Button = findViewById(R.id.button_plus)
        buttonPlus.setOnClickListener {
            val intent = Intent(this, PlusActivity::class.java)
            startActivity(intent)
        }
    }
}