package com.example.myapplication

fun main(){
   //Write a Kotlin  program to convert Kilometre to Metres or vice versa. Accept the choice from the user and perform the conversion accordingly. Note: Try to use lambda function for conversion
    println("Converting Kilometer to meter viceversa too")
    var distance= readLine()?.toDouble()?:0.0
    println("Enter ur choice")
    println("1) Km to M")
    println("2) M to Km")
    var cho= readLine()?.toInt()?:0
  var kmtom:(Double)->Double={distance->distance*1000}
    var mtokm:(Double)->Double={distance->distance*0.001}
    if (cho==1){
        println("Km = ${kmtom(distance)}")
    }else if (cho==2){

        println("M = ${mtokm(distance)}")
    }else{
        println("Something went wrong!!!")
    }
}