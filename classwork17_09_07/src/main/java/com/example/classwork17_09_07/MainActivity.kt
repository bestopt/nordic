package com.example.classwork17_09_07

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class  MainActivity : AppCompatActivity() {

    private val mImageAddress =
        "https://i.siteapi.org/el5sLscdOM6G6rFJV9B6AD0PPQg=/fit-in/1024x768/center/top/filters:quality(95)/ccaf0616f67de9b.ru.s.siteapi.org/img/mcb1croee0gsk4os04sgg448wskssg"

    var img: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.imageView)

        Glide.with(this)
            .load(mImageAddress)
            .into(img!!)

    }


}
