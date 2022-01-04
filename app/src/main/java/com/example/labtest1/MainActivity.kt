package com.example.labtest1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val googleBtn = findViewById<Button>(R.id.button1)
        val callbtn = findViewById<Button>(R.id.button2)




        googleBtn.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)
        }

        callbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0199999999"))
            startActivity(intent)
        }

    }
}