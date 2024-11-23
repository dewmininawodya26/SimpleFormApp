package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        val firstNameInput = findViewById<EditText>(R.id.firstName)
        val lastNameInput = findViewById<EditText>(R.id.lastName)
        val ageInput = findViewById<EditText>(R.id.age)
        val genderInput = findViewById<EditText>(R.id.gender)
        val submitButton = findViewById<Button>(R.id.submitButton)

        // Handle button click
        submitButton.setOnClickListener {
            val firstName = firstNameInput.text.toString().trim()
            val lastName = lastNameInput.text.toString().trim()
            val age = ageInput.text.toString().trim()
            val gender = genderInput.text.toString().trim()

            if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gender.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                val message = "Name: $firstName $lastName\nAge: $age\nGender: $gender"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}
