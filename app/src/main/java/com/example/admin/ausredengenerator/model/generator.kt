package com.example.admin.ausredengenerator.model

import java.util.Random

object generator {
    val random = Random()
    fun getNumber(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}