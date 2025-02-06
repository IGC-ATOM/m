package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept 3 numbers from the user and print the biggest & smallest of the 3 float values.

    println("Finding smalest and biggest of the 3 float  numbers")
    var num= FloatArray(3)
for(i in 0 until 3)
{
    println("Num$i :")
    num[i]= readLine()?.toFloat()?:3.145f
}
    num.sort()
   println("Minimum value :" +num[0])
    println("Minimum value :"+ num[2])
}