package com.ibnu.gridview

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView = findViewById<GridView>(R.id.gridView) as GridView
        var arrayList = ArrayList<Int>()
        var i = 0
        while (i <= 20) {
            arrayList.add(i)
            i++
        }
        val myAdapter: ArrayAdapter<Int> = ArrayAdapter(this@MainActivity,
                simple_list_item_1, arrayList)
        gridView.adapter = myAdapter
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this@MainActivity, "You have Click " +
                    arrayList.get(position), Toast.LENGTH_LONG).show()
        }
    }
}