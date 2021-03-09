package com.example.pruebatecnica.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pruebatecnica.R
import kotlinx.android.synthetic.main.activity_second_page.*

class secondPage : AppCompatActivity() {

    var selected = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
    }
    fun onOpcion1Clicked(view: View) {
        toggleButton2.isChecked = false
        toggleButton3.isChecked = false
        selected = "Opcion1"
    }
    fun onOpcion2Clicked(view: View) {
        toggleButton1.isChecked = false
        toggleButton3.isChecked = false
        selected = "Opcion2"
    }
    fun onOpcion3Clicked(view: View) {
        toggleButton1.isChecked = false
        toggleButton2.isChecked = false
        selected = "Opcion3"
    }


}