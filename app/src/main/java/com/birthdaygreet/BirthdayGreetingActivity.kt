package com.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity() : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(com.birthdaygreet.BirthdayGreetingActivity.Companion.NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n $name!"
    }


    }

