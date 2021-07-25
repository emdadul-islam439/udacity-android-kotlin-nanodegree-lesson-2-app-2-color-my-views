package com.example.lessong_2_part_2_color_my_views

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
            getString(R.string.how_to_play_property),
            getString(R.string.how_to_play_value)
        )

        binding.bindingClass = bindingClass
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.tvBoxOne,
            binding.tvBoxTwo,
            binding.tvBoxThree,
            binding.tvBoxFour,
            binding.tvBoxFive
        )
        for(view in clickableViews){
            view.setOnClickListener {
                makeColored(it)
//                binding.invalidateAll()
            }
        }
    }

    private fun makeColored(view: View) {
        when (view) {
            // Boxes using Color class colors for background
            binding.tvBoxOne -> view.setBackgroundColor(Color.DKGRAY)
            binding.tvBoxTwo -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.tvBoxThree -> view.setBackgroundResource(android.R.color.holo_orange_light)
            binding.tvBoxFour -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.tvBoxFive -> view.setBackgroundResource(android.R.color.holo_blue_bright)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}