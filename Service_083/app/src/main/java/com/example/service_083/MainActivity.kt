package com.example.service_083

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/vanessa.brilliant"))
            startActivity(i)
        })

        btn2.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/brlinn_"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.menghapus_jejakmu_official_music_video)

        btn3.setOnClickListener {
            MediaPlayer?.start()
    }
        btn4.setOnClickListener {
            MediaPlayer?.pause()
}
        btn5.setOnClickListener {
            MediaPlayer?.pause()
                MediaPlayer?.seekTo(0)

        }
    }
}
