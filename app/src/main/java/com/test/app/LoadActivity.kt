package com.test.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class LoadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        val intentChoose = Intent(this, ChooseGirlActivity::class.java)
        val intentChoos = Intent(this, ChatActivity::class.java)

        //todo change time to 3200
        Timer().schedule(2300){
            startActivity(intentChoos)
        }

    }
}