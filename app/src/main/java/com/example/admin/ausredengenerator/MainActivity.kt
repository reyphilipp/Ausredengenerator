package com.example.admin.ausredengenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.admin.ausredengenerator.model.GeneratorAusrede
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generatorAusrede = GeneratorAusrede()

        //First Startup
        txtAusrede.text = generatorAusrede.buildedSentence()
        //Button
        btnGenerate.setOnClickListener {
            txtAusrede.text = generatorAusrede.buildedSentence()
        }
    }
}
