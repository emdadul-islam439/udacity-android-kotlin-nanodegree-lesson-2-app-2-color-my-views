package com.example.lessong_2_part_2_color_my_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lessong_2_part_2_color_my_views.databinding.ActivityMainBinding
import com.example.lessong_2_part_2_color_my_views.model.DataClassForBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var bindingClass : DataClassForBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bindingClass = DataClassForBinding("Hello Emdad!")

        binding.bindingClass = bindingClass
    }
}