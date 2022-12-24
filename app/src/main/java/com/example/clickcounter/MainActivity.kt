package com.example.clickcounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countVariable:Int = 0
        imageButton.setOnClickListener{
        imageButton.text = "You Clicked ${++countVariable} times"
            if(countVariable>=15)   imageButton.text = "Kitna Khali Hai Re Tu BSDK!!!"
            if(countVariable>=35)   imageButton.text = "Haan Aise Hi Dabate reh Chutiye!!!"
            if(countVariable>=55)   imageButton.text = "Chala Jaa BSDK!!!"
        }

    }


}