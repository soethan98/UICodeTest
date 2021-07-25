package com.soethan.uicodetest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soethan.uicodetest.databinding.ActivityCarListBinding

class CarListActivity : AppCompatActivity() {

    private val carListAdapter by lazy {
        CarListAdapter {
            startActivity(CarDetailActivity.startIntent(this))
        }
    }

    private lateinit var binding: ActivityCarListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCarListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgBtnBack.setOnClickListener { onBackPressed() }
        binding.rvCars.apply {
            layoutManager =
                LinearLayoutManager(this@CarListActivity, LinearLayoutManager.VERTICAL, false)
            setHasFixedSize(true)
            adapter = carListAdapter
        }
    }

    companion object {
        fun startIntent(activity: Activity): Intent {
            return Intent(activity, CarListActivity::class.java)
        }
    }
}