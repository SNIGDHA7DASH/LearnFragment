package com.example.iteradmin.learnfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.widget.Button

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.main_button)

        var i = 0
        button.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransition = fragmentManager.beginTransaction()
            val second_fragment = second_fragment()
            val firstfragment = MyFragment()
            if (i % 2 == 0) {
                //fragmentTransition.add(R.id.frag_one,second_fragment)
                //fragmentTransition.commit()
                fragmentTransition.replace(R.id.frag_one, second_fragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()
            } else {
                fragmentTransition.replace(R.id.frag_one, firstfragment)
                fragmentTransition.addToBackStack(null)
                fragmentTransition.commit()

            }
            i++
        }
    }
}