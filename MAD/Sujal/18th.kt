package com.example.myapplication

fun main(){
    //Write a Kotlin program to input 5 numbers from the user and find their sum and average.
    println("Enter 5 numbers :")
    var num= readLine()?.toInt()?:0
    var digit=Array(5){0}
    var sum:Double=0.0
    for (i in 0 until 5){
        digit[i]=num%10
        num=num/10
        sum=sum+digit[i]
    }
    println("Sum =$sum")
    var avg:Double=sum/5
    println("Average =$avg")
}