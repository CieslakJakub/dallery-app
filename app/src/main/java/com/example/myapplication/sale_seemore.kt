package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sale_seemore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_seemore)

        val imageView = findViewById<ImageView>(R.id.sailbtn2)
        val right = findViewById<Button>(R.id.right)
        val left = findViewById<Button>(R.id.left)


        val ids: Array<Int> = arrayOf(
            R.drawable.sale_seemore,
            R.drawable.sale_seemore1,
            R.drawable.sale_seemore3
        )
        var counter = 0
        val lenght = ids.size
        var currentImage = counter + 1


        imageView.setImageResource(ids[0])

        right.setOnClickListener {
            counter++
            if (counter >= lenght) {
                counter = 0
                currentImage = 0
            }
            imageView.setImageResource(ids[counter])
            currentImage++


        }
        left.setOnClickListener {
            counter--
            if (counter < 0) {
                counter = lenght - 1
                currentImage = 0
            }

            imageView.setImageResource(ids[counter])
            currentImage--
        }
    }
}