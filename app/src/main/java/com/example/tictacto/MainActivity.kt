package com.example.tictacto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tictacto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
   var image:Boolean=false
    fun btn1(view: View) {
        if (image) {
            binding.button1.setBackgroundResource(R.drawable.circle)
        } else {
            binding.button1.setBackgroundResource(R.drawable.cross)
        }
        image = !image
    }

        var image1:Boolean=false
        fun btn2(view: View) {
            if (image1) {
                binding.button2.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button2.setBackgroundResource(R.drawable.cross)
            }
            image1 = !image1
        }
        var image2:Boolean=false
        fun btn3(view: View) {
            if (image2) {
                binding.button3.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button3.setBackgroundResource(R.drawable.cross)
            }
            image2 = !image2
        }
        var image3:Boolean=false
        fun btn4(view: View) {
            if (image3) {
                binding.button4.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button4.setBackgroundResource(R.drawable.cross)
            }
            image3 = !image3
        }
        var image4:Boolean=false
        fun btn5(view: View) {
            if (image4) {
                binding.button5.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button5.setBackgroundResource(R.drawable.cross)
            }
            image4 = !image4
        }
        var image5:Boolean=false
        fun btn6(view: View) {
            if (image5) {
                binding.button6.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button6.setBackgroundResource(R.drawable.cross)
            }
            image5 = !image5
        }
        var image6:Boolean=false
        fun btn7(view: View) {
            if (image6) {
                binding.button7.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button7.setBackgroundResource(R.drawable.cross)
            }
            image6 = !image6
        }
        var image7:Boolean=false
        fun btn8(view: View) {
            if (image7) {
                binding.button8.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button8.setBackgroundResource(R.drawable.cross)
            }
            image7 = !image7
        }
        var image8:Boolean=false
        fun btn9(view: View) {
            if (image8) {
                binding.button9.setBackgroundResource(R.drawable.circle)
            } else {
                binding.button9.setBackgroundResource(R.drawable.cross)
            }
            image8 = !image8
        }
    }




