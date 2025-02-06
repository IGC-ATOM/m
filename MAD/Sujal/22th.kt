package com.example.myapplication

fun main(){
    //Write a Kotlin program to print the following pattern:
    for (i in 8 downTo 1){
        for (j in 1 .. i){
            print("*")
        }
        println()
    }
}