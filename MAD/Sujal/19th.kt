package com.example.myapplication

fun main(){
    //Write a Kotlin program to print the following pattern:
    for (i in 1 .. 10){
        for (j in 1 ..i){
            print(j)
        }
        println()
    }
}