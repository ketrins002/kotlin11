package com.rcompany.kotlin11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val button: Button = findViewById(R.id.btn)
        val nameET: EditText = findViewById(R.id.name)
        val surnameET: EditText = findViewById(R.id.surname)
        val ageET: EditText = findViewById(R.id.age)
        val hobbyET: EditText = findViewById(R.id.hobby)
        val secondNameET: EditText = findViewById(R.id.secondname)

        button.setOnClickListener {
            val name = nameET.text.toString()
            val surname = surnameET.text.toString()
            val age = ageET.text.toString().toInt()
            val hobby = hobbyET.text.toString()
            val secondName = secondNameET.text.toString()

            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("surname", surname)
            intent.putExtra("age", age)
            intent.putExtra("hobby", hobby)
            intent.putExtra("secondname", secondName)
            startActivity(intent)
        }
    }
}