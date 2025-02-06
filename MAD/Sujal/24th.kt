package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept N values from the user, and perform the addition of positive numbers only. Note: Use a do-while loop and using UDF.
    println("Enter 5 values in numbers :")
    var num=Array(5){0}
    var sum=0
    for (i in 0 until 5){
        num[i]= readLine()?.toInt()?:0

    }

    fun add(n1:Array<Int>):Int {
        var i=0
        do {
            if (n1[i]>0){
                sum=sum+n1[i]
            }

            i++

        }while (i<=n1.size-1)
        return (sum)
    }
    println("Sum ${add(num)}")
}

