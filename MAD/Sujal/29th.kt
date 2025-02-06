package com.example.myapplication

fun main() {
    //Write a Kotlin program to accept a number from the user and check whether it is an Armstrong number or not. Note: Use do-while loop & create UDF
    //Example: 153 is an Armstrong number because (13)+(53)+(33) = 153.

    println("Validating Armstrong..")
    println("Enter a number :")
    var num = readLine().toString()
    var count = num.length
    var orgnum = num?.toInt() ?: 0
    var orgnum2 = orgnum
    var digit = 0
    var tot = 1
    var arm = 0
    do {

        digit = orgnum % 10

        orgnum = orgnum / 10

        repeat(count) {

            tot = tot * digit

        }
        arm = arm + tot
        tot = 1
    } while (orgnum > 0)
    if (orgnum == orgnum2) {
        println("total $arm is Armstrong number")
    }else{
        println("Not an Armstrong!!")
    }

}

