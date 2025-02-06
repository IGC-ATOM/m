package com.example.myapplication

fun main(){
    // Write a Kotlin program to store your enrollment number, name & course in different variables and display on the screen.
    println("Enrollment Number :")
    val erollno:Int= readLine()?.toInt()?:12
    println("Name :")
    val name:String= readLine().toString()
    println("Enter marks of the subject..")

    println("Python :")
    val python:Int= readLine()?.toInt()?:12

    println("DBMS :")
    val DBMS:Int=readLine()?.toInt()?:45

    println("Python :")
    val Python:Int= readLine()?.toInt()?:12

    println("Webdesigning :")
    val Webdesigning:Int=readLine()?.toInt()?:45

    println("Java :")
    val Java:Int=readLine()?.toInt()?:45

    println("Enrollment NO :$erollno")
    println("Name :$name")

    println("Python :$python")
    println("DBMS :$DBMS")
    println("Python :$Python")
    println("Webdesigning :$Webdesigning")
    println("Java :$Java")


}