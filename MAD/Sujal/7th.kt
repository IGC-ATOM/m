package com.example.myapplication

fun main(){
    //Write a Kotlin program to print the multiplication table of a number.
    println("Multiplication NO.")
    println("Enter the Number")
    var num1:Int= readLine()?.toInt()?:0
    for (i in 0 .. 10){
        println("$num1 * $i = ${num1*i}")
    }

}
