package com.example.fragment_use

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment_use.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b2f.setOnClickListener {

            supportFragmentManager
                .beginTransaction().replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()

        }
        supportFragmentManager
            .beginTransaction().replace(R.id.place_holder, BlankFragment.newInstance())
            .commit()
    }

}