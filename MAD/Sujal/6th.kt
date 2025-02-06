package com.example.myapplication

fun main(){
    //Write a Kotlin program to calculate and display the Simple Interest. Accept the input by the user.
    println("Calculating Simple Interest..")
    println("Enter the values :")
    println("Principal :")
    var p:Double= readLine()?.toDouble()?:12.1
    println("Rate of interest per anum :")
    var r= readLine()?.toDouble()?:12.1
    println("Time in Years :")
    var t= readLine()?.toDouble()?:12.1

    var si:Double=p*r*t
    println("Simple Interest : ${si/100}")

}
