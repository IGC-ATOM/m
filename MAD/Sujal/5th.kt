package com.example.myapplication

fun main(){
    //Write a Kotlin program to perform the arithmetic operation on 2 numbers accepted from the user.
    println("Enter Number 1 :")
    var num1= readLine()?.toInt()?:12
    println("Enter Number 2 :")
    var num2= readLine()?.toInt()?:12
    println("Operator :")
    var op= readLine()

    if (op=="+")
    {
        println("Operation is :${num1+num2}")
    }else if (op=="-")
    {
        println("Operation is :${num1-num2}")
    }else if (op=="*")
    {
        println("Operation is :${num1*num2}")
    }else if (op=="/")
    {
        println("Operation is :${num1/num2}")
    }else if (op=="%")
    {
        println("Operation is :${num1%num2}")
    }


}
