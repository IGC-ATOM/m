package com.example.myapplication


fun main(){
    //Write a Kotlin program to create an array of 5 string values and print them using forEach loop. Also create UDF for the same.

    var str=Array(5){""}
    for(i in 0 until 5){
        println("Enter ${i+1} String :")
        str[i]= readLine().toString()
    }
    println("Printing all Strings")
    str.forEach {
        println(it)
    }
}
