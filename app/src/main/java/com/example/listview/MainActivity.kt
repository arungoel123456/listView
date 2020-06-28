package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView= findViewById<ListView>(R.id.listView)

        val cityNames= arrayOf("Delhi", "NY")
        val adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1 , cityNames)
        listView.adapter= adapter

        listView.setOnItemClickListener{adapter, view , position , id->
            val city = view as TextView
            Toast.makeText(this , city.text , Toast.LENGTH_LONG).show()
        }


    }
}