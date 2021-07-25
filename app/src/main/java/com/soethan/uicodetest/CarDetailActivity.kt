package com.soethan.uicodetest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soethan.uicodetest.databinding.ActivityCarDetailBinding
import com.soethan.uicodetest.databinding.ActivityMainBinding

class CarDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgBtnBack.setOnClickListener { onBackPressed() }
    }

    companion object {
        fun startIntent(activity: Activity): Intent {
            return Intent(activity, CarDetailActivity::class.java)
        }
    }
}