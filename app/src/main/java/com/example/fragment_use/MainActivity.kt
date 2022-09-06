package com.example.fragment_use

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment

import com.example.fragment_use.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val dataModel: DataModel by viewModels()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openFrag(BlankFragment.newInstance(), R.id.place_holder)
        openFrag(BlankFragment2.newInstance(), R.id.place_holder2)
        dataModel.messageForActivity.observe(this, {
            binding.textView.text = it })

    }
    private fun openFrag(f: Fragment, idHolder: Int){
        supportFragmentManager
            .beginTransaction().replace(idHolder, f)
            .commit()

    }

}