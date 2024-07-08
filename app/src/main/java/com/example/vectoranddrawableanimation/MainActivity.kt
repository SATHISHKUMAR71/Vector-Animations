package com.example.vectoranddrawableanimation

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimationUtils

class MainActivity : AppCompatActivity() {

    lateinit var animation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            val unCheck: ImageView = findViewById(R.id.tick_anim)
            unCheck.setImageResource(R.drawable.avd_anim)
            val tick:AnimatedVectorDrawable = unCheck.drawable as AnimatedVectorDrawable
            tick.start()
        }

        findViewById<Button>(R.id.button2).setOnClickListener{
            val check: ImageView = findViewById(R.id.tick_anim)
            check.setImageResource(R.drawable.avd_anim_check)
            val tick:AnimatedVectorDrawable = check.drawable as AnimatedVectorDrawable
            tick.start()
        }

    }
}