package com.example.myapplication

fun main(){
    //Write a Kotlin program to demonstrate the use of mutable and immutable variables in a program
    println("Mutable Variable")
    println("BEFORE")
    var name="Sujal"
    println("name=$name")
    println("AFTER")
    name="Patel"
    println("name=$name")
    println("Therefore we can change the value of the mutable variable which can be declared by keyword 'var' ")
    println("IMMutable Variable")
    println("BEFORE")
    val name2="Sujal"
    println("name=$name2")
    println("AFTER")

    println("name=$name2")
    println("Therefore we cant change the value of the Imutable variable which can be declared by keyword 'val' ")
}
