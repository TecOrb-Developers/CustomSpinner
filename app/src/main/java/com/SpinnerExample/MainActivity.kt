package com.SpinnerExample

import android.content.Context
import android.graphics.Typeface
import com.customspinner.ExtraPackage.SpinnerWindow
import com.customspinner.ExtraPackage.SpinnerWindow_interface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import java.util.ArrayList

class MainActivity : AppCompatActivity(),SpinnerWindow_interface {
    private var txtSpinner:TextView?=null
    private lateinit var context:Context
    private var list: MutableList<String>?= mutableListOf()
     var face1: Typeface? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context=this
        face1 = ResourcesCompat.getFont(this, R.font.din_condensed_bold);
        txtSpinner=findViewById(R.id.txtSpinner)
        list!!.add("January")
        list!!.add("February")
        list!!.add("March")
        list!!.add("April")
        list!!.add("May")
        list!!.add("June")
        list!!.add("July")
        list!!.add("August")
        list!!.add("September")
        list!!.add("October")
        list!!.add("November")
        list!!.add("December")
        txtSpinner!!.setOnClickListener {
            SpinnerWindow(this)
            SpinnerWindow.showSpinner(context, list as ArrayList<String>?)
            SpinnerWindow.setTitleFont(face1,context)

        }
    }

    override fun selectedPosition(position: Int) {
        txtSpinner?.let{
            it.text= list!![position]
        }

    }


}