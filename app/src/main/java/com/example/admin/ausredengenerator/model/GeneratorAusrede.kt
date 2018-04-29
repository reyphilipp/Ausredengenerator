package com.example.admin.ausredengenerator.model

class GeneratorAusrede {
    val woerter_1 = listOf("Harmonische", "Solaren","Termalen","Linearen","Heisenbergschen","Kollidierten","Magnetischen","Konstanten","Subharmonischen")
    val woerter_2 = listOf("Störungen","Interferenzen", "Kollisionen","Interups", "Determinierungen","Kompilierungen")
    val woerter_3 = listOf("RAM", "CD", "LAN","WAN","CPU","HDD", "IOT")
    val woerter_4 = listOf("Bus", "Controller","Stack","Array","Communications Interfaces","Treiber")

    fun buildedSentence():String {
        val wort1 = woerter_1[generator.getNumber(0,woerter_1.size-1)]
        val wort2 = woerter_2[generator.getNumber(0,woerter_2.size-1)]
        val wort3 = woerter_3[generator.getNumber(0,woerter_3.size-1)]
        val wort4 = woerter_4[generator.getNumber(0,woerter_4.size-1)]
        return "Es liegt an $wort1 $wort2 im $wort3 $wort4."
    }
}