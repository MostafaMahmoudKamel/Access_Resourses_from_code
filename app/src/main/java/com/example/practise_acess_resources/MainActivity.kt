package com.example.practise_acess_resources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    lateinit var txt:TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init_call()
        callBacks()

    }
    fun init_call(){
        txt=findViewById(R.id.textView)
        img=findViewById(R.id.imageView)
        btn=findViewById(R.id.button)

    }
    fun callBacks(){
        btn.setOnClickListener {
            update_image()
            update_Text()
            update_Color()
        }
    }
    fun update_image(){
        var image=ContextCompat.getDrawable(this,R.drawable.sandwitch1)
        img.setImageDrawable(image)
    }

    fun update_Text(){
        txt.text=getText(R.string.sic)
    }
    fun update_Color(){
        var color=ContextCompat.getColor(this,R.color.red)
        txt.setTextColor(color)

    }
}