package com.turgutkurt.kotlinintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.turgutkurt.kotlinintentapp.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //get intent
        val intent = intent
        var userName =intent.getStringExtra("username")
        var fullName =intent.getStringExtra("fullname")

        binding.textViewUserName.text="UserName : ${userName}"
        binding.textViewFullName.text="FullName : ${fullName}"
    }
}