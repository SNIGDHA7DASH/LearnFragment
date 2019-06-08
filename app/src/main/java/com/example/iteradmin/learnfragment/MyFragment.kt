package com.example.iteradmin.learnfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MyFragment :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val rootView:View =  inflater.inflate(R.layout.my_fragment,container,false)
        val button = rootView.findViewById<Button>(R.id.frag_button)
        button.setOnClickListener {
            Toast.makeText(context,"worked",Toast.LENGTH_LONG).show()
        }
        return rootView

    }
}