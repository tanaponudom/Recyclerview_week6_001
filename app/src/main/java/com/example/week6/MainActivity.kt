package com.example.week6

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? =  null
    var foodMenuText = arrayOf(
        "Dead by daylight ",
        "Call of duty MWF",
        "Farcry 4",
        "Rainbow six siege",
        "Battle Field V",
        "Left 4 dead",
        "PUBG",
        "Call of duty mobile",
        "Forza Horizontal",
        "Need for speed heat",
        "Asphalt 9",
        "Sea of thieves",
        "GTA V")
    var foodMenuImage = arrayOf<Int>(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13
        )
    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapter(foodMenuText,foodMenuImage,context)
        recyclerView!!.adapter = myAdapter
    }
}
