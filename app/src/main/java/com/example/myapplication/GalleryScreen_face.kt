package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class GalleryScreen_face : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_screen_face)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val buttonClick = findViewById<Button>(R.id.see_more3)
        buttonClick.setOnClickListener {
            val intent = Intent(this, face_seemore::class.java)
            startActivity(intent)
        }
    }
}