package com.example.myapplication

fun main(){
    //Write a Kotlin program to find the sum of digits of a number accepted from the user.
    println("Enter any numbers :")
    var num= readLine()?.toInt()?:0
    var sum:Int=0
    var dgt:Int=0
    while (num!=0){
        dgt=num%10
        sum=sum+dgt
        num=num/10

    }



    println(sum)

}