package com.example.myapplication


fun main(){
    //Write a Kotlin program to find even and odd numbers between a given range. Accept the range values from the user.
    println("finding even and odd numbers between a given range")
    println("Range 0 to :")
    var range= readLine()?.toInt()?:0
    for (i in 2..range){
        if (i%2==0){
            println("Even $i")
        }
    }
    for (i in 2..range){
        if (i%2!=0){
            println("odd $i")
        }
    }
}

