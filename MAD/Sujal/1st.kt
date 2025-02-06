package com.example.myapplication

fun main(){
    //Write a Kotlin program to display your name and age entered by the user.
    println("Enter your name :")
    val name:String= readLine().toString()
    println("Enter your age :")
    val age:Int= readLine()?.toInt()?:12
    println("Your name is $name and age is $age.")
}