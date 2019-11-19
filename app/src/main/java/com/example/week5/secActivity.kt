package com.example.week5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sec.*

class secActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        setTitle("ข้อมูล")

        var name = intent.extras?.getString(MainActivity().TAG_NAME)

        text_show.setText(name)

        btn_back.setOnClickListener {

            finish()
        }
    }
}