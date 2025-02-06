package com.example.myapplication

fun main(){

   // Write a Kotlin program to swap 2 values accepted from the user without using a third variable.
    println("Swaping 2 values")
    println("Enter num1")
    var num1= readLine()?.toInt()?:0
    println("Enter num2")
    var num2= readLine()?.toInt()?:0
    println("Before num1=$num1 and num2=$num2")
    num1=num1+num2
    num2=num1-num2
    num1=num1-num2
    println("After num1=$num1 and num2=$num2")

}