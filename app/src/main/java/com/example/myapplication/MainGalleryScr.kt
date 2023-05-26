package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.view.WindowCompat

class MainGalleryScr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gallery_scr)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val buttonClick = findViewById<ImageButton>(R.id.timebtn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, GalleryScreen::class.java)
            startActivity(intent)
        }
    }
}