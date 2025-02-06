package com.example.myapplication
fun main(){
    //Rewrite the program for question no. 11 using lambda.

    println("Enter number positive negative or zero :")
    var n= readLine()?.toInt()?:0

    //Positive
    var pos:(Int)->Boolean={n1->n1>0}
    if (pos(n)){
        println("Number $n is positive..")
    }
    //Negative
    var neg:(Int)->Boolean={n1->n1<0}
    if (neg(n)){
        println("Number $n is Negative..")
    }

    //Zero
    var z:(Int)->Boolean={n1->n1==0}
    if (z(n)){
        println("Number $n is Zero..")
    }
}
