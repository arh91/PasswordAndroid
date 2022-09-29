package com.example.password

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val readPassword=findViewById<EditText>(R.id.editextPassword)
        val verifyBtn=findViewById<Button>(R.id.verifyButton)
        verifyBtn.setOnClickListener {
            if (readPassword.text.toString() == "abc123") {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_LONG).show()
            }
        }
    }
}