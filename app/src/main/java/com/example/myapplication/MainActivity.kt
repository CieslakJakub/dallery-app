package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val buttonClick = findViewById<Button>(R.id.artist)
        buttonClick.setOnClickListener {
            val intent = Intent(this, ArtistScreen::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.gallery)
        button.setOnClickListener {
            val intent = Intent(this, MainGalleryScr::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.abtus)
        button1.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

    }
}