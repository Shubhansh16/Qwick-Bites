package com.example.qwickbites.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qwickbites.R
import com.example.qwickbites.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setVariable()
    }

    private fun setVariable() {
        binding.tvLogin.setOnClickListener {

        }

        binding.tvRegister.setOnClickListener {

        }
    }
}