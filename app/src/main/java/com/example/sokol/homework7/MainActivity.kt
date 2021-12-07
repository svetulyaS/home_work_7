package com.example.sokol.homework7

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var basicInformationButton: Button
    lateinit var forParentsButton: Button
    lateinit var forStudentsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        basicInformationButton = findViewById(R.id.basic_information)
        forParentsButton = findViewById(R.id.for_parents)
        forStudentsButton = findViewById(R.id.for_student)

        basicInformationButtonClick()

    }

    fun basicInformationButtonClick() {
        basicInformationButton.setOnClickListener {
            Toast.makeText(
                this,
                "Welcome to our application. On this page you can find out all the information about him.",
                Toast.LENGTH_LONG
            ).show()
        }
        forParentsButtonClick()
    }

    fun forParentsButtonClick(){
        forParentsButton.setOnClickListener {
            Toast.makeText(
                this,
                "On this page you can find useful information for teachers",
                Toast.LENGTH_LONG
            ).show()

        }
        forStudentsButtonClick()

    }
    fun forStudentsButtonClick() {
        forStudentsButton.setOnClickListener {
            Toast.makeText(this,"On this page you can find useful information for students", Toast.LENGTH_LONG).show()
        }
    }




}