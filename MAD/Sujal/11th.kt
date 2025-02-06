package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept a number from the user and check whether the number is positive, negative or zero.
    println("Enter any number :")
    var num= readLine()?.toInt()?:0
    if (num<0)
    {
        println("The number is negative.")
    }else if(num==0){
        println("The number is zero")
    }else if(num>0){
        println("number is positive")
    }else{
        println("Something went wrong")

    }
}