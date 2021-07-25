package com.example.lessong_2_part_2_color_my_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lessong_2_part_2_color_my_views.databinding.ActivityMainBinding
import com.example.lessong_2_part_2_color_my_views.model.DataClassForBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var bindingClass: DataClassForBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bindingClass = DataClassForBinding(
            getString(R.string.box_one),
            getString(R.string.box_two),
            getString(R.string.box_three),
            getString(R.string.box_four),
            getString(R.string.box_five),
        )

        binding.bindingClass = bindingClass
    }
}