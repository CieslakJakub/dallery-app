package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class GalleryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_screen)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val buttonClick = findViewById<Button>(R.id.see_more)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Time_seemore::class.java)
            startActivity(intent)
        }
    }
}