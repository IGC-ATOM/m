package com.example.myapplication

fun main(){
    //Write a Kotlin  program to print the fibonacci series having “N” elements. Accept the value of N from the user. Note:Use loop in reverse order & create UDF
    println("Enter the range for fibonacci series")
    var num= readLine()?.toInt()?:0
    var count=0
    var fibo=Array(num){0}

    fibo[0]=0
    fibo[1]=1
    for(i in 2 until num){
        fibo[i]=fibo[i-1]+fibo[i-2]
    }

    for(i in fibo.size-1 downTo 0){
        print("${fibo[i]} ")
    }
}