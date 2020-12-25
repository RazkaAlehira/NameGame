package com.example.namegame

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.namegame.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        btn_main.setOnClickListener {
            d("Dzaky Sayang", "Hello ${edt_text.text}!")
            txt_message.text = "Hello ${edt_text.text}!!!"
        }
    }
}