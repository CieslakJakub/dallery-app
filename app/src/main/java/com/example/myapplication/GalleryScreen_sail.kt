package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class GalleryScreen_sail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_screen_sail)


        WindowCompat.setDecorFitsSystemWindows(window, false)
        val buttonClick = findViewById<Button>(R.id.see_more2)
        buttonClick.setOnClickListener {
            val intent = Intent(this, sale_seemore::class.java)
            startActivity(intent)
        }
    }
}