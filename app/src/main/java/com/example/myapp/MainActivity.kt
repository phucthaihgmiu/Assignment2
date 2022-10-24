package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var foods = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickAddFood(view: View){
        var newFood = et.text.toString().trim();
        if(newFood.isNotEmpty()){
            tv.text = newFood;
            foods.add(newFood);
        }
    }

    fun clickDecide(view: View){
        var random = Random.nextInt(foods.size);
        tv.text = foods[random];
    }
}