package com.example.namegame

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.namegame.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        btn_main.setOnClickListener {
            d("Dzaky Sayang", "Hello ${edt_text.text}!")
            txt_message.text = "Hello ${edt_text.text}!!!"

            if (edt_text.text.toString() == "Badboyhalo") {
                img_badboyhalo.setImageResource(R.drawable.badboyhalo)
            } else if (edt_text.text.toString() == "Dream") {
                img_badboyhalo.setImageResource(R.drawable.fundywife)
            } else {
                Toast.makeText(this, "Fill The Blank!?", Toast.LENGTH_SHORT).show()
            }
        }
    }
}