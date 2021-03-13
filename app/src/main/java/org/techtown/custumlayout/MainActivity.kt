package org.techtown.custumlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.part1.view.*
import org.techtown.custumlayout.part1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        part1.imageView.setImageResource(R.mipmap.ic_launcher)
        part1.textView.setText("홍길동")
        part1.textView2.setText("010-1000-10000")


        button.setOnClickListener {
            part1.imageView.setImageResource(R.drawable.image1)
            part1.textView.setText("승재")
            part1.textView2.setText("010-111-11111")
        }

        button2.setOnClickListener {
            part1.imageView.setImageResource(R.drawable.image2)
            part1.textView.setText("모코")
            part1.textView2.setText("010-1212-1234")

        }
    }
}