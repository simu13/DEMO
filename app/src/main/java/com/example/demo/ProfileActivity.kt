package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.btnOpenMain)
        button.setOnClickListener {
            val i = Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(i)
        }
        // Set the LayoutManager that this RecyclerView will use.
        rv.layoutManager = GridLayoutManager(this, 2)
        // Adapter class is initialized and list is passed in the param.
        val itemAdapter = ItemAdapter(this,getItemsList())
        // adapter instance is set to the recyclerview to inflate the items.
        rv.adapter = itemAdapter
    }
    private fun getItemsList(): ArrayList<HomeIcons> {
        val list = ArrayList<HomeIcons>()
        // 1
        val item1 = HomeIcons(
            R.drawable.group,
        )

        list.add(item1)

        // 2
        val item2 = HomeIcons(
            R.drawable.group,
        )

        list.add(item2)

        // 3
        val item3 = HomeIcons(
            R.drawable.group,
        )

        list.add(item3)

        // 4
        val item4 = HomeIcons(
            R.drawable.group,
        )

        list.add(item4)

        // 5
        val item5 = HomeIcons(
            R.drawable.group,
        )

        list.add(item5)

        // 6
        val item6 = HomeIcons(
            R.drawable.group,
        )

        list.add(item6)



        return list
    }
}