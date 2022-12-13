package com.turgutkurt.kotlinintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.turgutkurt.kotlinintentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("on create called")
    }

    //Uygulama ilk çalıştığında onCreate ve onResume çalışır
    //Telefon arkaplanda (anasayfada) uygulama çalışıyor iken tekrar uygulamayı çağırınca onResume çalışır
    override fun onResume() {
        super.onResume()

        println("on resume called")

    }

    //Uygulamayı çalışır halden arka plan da anasayfaya döner isem onPause ve onStop çalışır
    override fun onPause() {
        super.onPause()

        println("on pause called")

    }

    override fun onStop() {
        super.onStop()

        println("on stop called")

    }
    //Uygulamayı sonlandırır isek sırasıyla onPause , onStop ve onDestroy fnc çalışır
    override fun onDestroy() {
        super.onDestroy()

        println("on destroy called")

    }

    fun handleNext(view:View){
        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",binding.textUserName.text.toString())
        intent.putExtra("fullname",binding.textFullName.text.toString())
        startActivity(intent)
    }
}