package com.example.demokotlinproject

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    var TAG = DetailActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }
    fun initViews(){
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        var user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())

        tv_detail.text = user.toString()
    }
}