package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        val size = intent.getStringExtra(TEXT_SIZE_KEY)
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {if (size != null) textSize = size.toFloat() }
        val dis = findViewById<TextView>(R.id.lyricsDisplayTextView)




    }
}