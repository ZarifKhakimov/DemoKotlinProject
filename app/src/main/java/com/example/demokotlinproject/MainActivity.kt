package com.example.demokotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.demokotlinproject.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener {
            var user = User(age = 14, name = "Zarifjon")
            openDetailActivity(user) }
    }

    fun openDetailActivity(user: User){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}