package com.sprinthub.example.customviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentColor = Color.TRANSPARENT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorSelector.setColorSelectListener { colorInt ->
            currentColor = colorInt
            colorSwatch.setBackgroundColor(currentColor)
        }

        colorSelector.selectedColorValue = Color.RED
    }
}
