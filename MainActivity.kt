package com.example.registracia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var name = findViewById<EditText>(R.id.name)
        var lastname = findViewById<EditText>(R.id.lastName)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var toast = findViewById<Button>(R.id.button)


        toast.setOnClickListener {
            if(name.text.length > 2 && lastname.text.length > 4 && password.text.length > 9 && email.text.contains("@")){
                Toast.makeText(this, "რეგისტრაცია წარმატებით დასრულდა", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "შეიყვანეთ სწორი მონაცემები", Toast.LENGTH_SHORT).show()
        }



    }
}