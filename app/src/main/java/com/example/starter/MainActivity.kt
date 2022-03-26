package com.example.starter

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit = findViewById(R.id.edit)

    }

    @SuppressLint("QueryPermissionsNeeded")
    fun start(view: View) {
        val data: String = edit.text.toString()

        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(data)
        )

        val manager = packageManager
        if (intent.resolveActivity(manager) != null) {
            startActivity(intent)
        }
    }
}