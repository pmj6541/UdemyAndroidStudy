package com.example.flo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flo.databinding.ActivitySongBinding

//안드로이드에서 activity 기능을 사용할 수 있게 만드는 것
//코틀린에서는 다른 클래스 상속시 괄호를 넣어줘야함
class SongActivity : AppCompatActivity() {

    lateinit var binding : ActivitySongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.songDownIb.setOnClickListener {
            finish()
        }

    }


}