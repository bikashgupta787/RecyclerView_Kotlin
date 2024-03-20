 package com.example.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)
        var newsArrayImage = arrayOf(
            R.drawable.jaddu,
            R.drawable.kohli,
            R.drawable.klrahul,
            R.drawable.mahi,
            R.drawable.rohit,
        )

        var newsHeadingArray = arrayOf(
            "Jadejaaaa",
            "King kohli",
            "Kaamal lajab rahul",
            "Mahi maar raha hai",
            "Hitman sharma"
        )

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for (index in newsArrayList.indices){
            val news = News(newsHeadingArray[index],newsArrayImage[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newsArrayList,this)
    }
}