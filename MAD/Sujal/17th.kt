package com.example.myapplication

import java.time.temporal.TemporalAccessor

//Write a Kotlin program to accept Employee Code, Employee Name, Employee Department and Employee Basic Salary. Calculate the Gross Salary of the employee using the following criterias:

fun main(){
    println("Calculating employee salary")
    println("Enter the values below :!!")

    print(" Employee Code :")
    val empcode:Int= readLine()?.toInt()?:0

    println()

    print("Employee Name :")
    val empname= readLine()

    println()

    print("Employee Department :")
    val empdepart= readLine()

    println()

    print("Employee Basic salary :")
    var empbasicsalary:Double= readLine()?.toDouble()?:0.1

    var hra:Double=empbasicsalary*5/100
    var da:Double=empbasicsalary*12/100
    var ta:Double=0.0
    when(empdepart){
        "HR"->{
            ta=300.0
        }
        "IT"->{
            ta=500.0
        }
        "Sales"->{
            ta=800.0
        }
        else->{
            println("Something went wrong!!!")
        }
    }
    var allowance:Double=0.0
fun Allowance(hra:Double,da:Double,ta:Double):Double{
    allowance=hra+da+ta
    return(allowance)
}
allowance=Allowance(hra,da,ta)
    var gross:Double=empbasicsalary+allowance
    var tax:Double=0.0

    if (gross>=75000.0){
        tax=gross*25/100
    }
    else if (gross>=26000.0 && gross<75000.0){
        tax=gross*15/100
    }else if (gross<=25000.0){
        tax=0.0
    }
    else{
        println("Something went wrong!!!")
    }

    var netsalary:Double = gross - tax
    println("Employee Salary :$empname")
    println("Employee Code :$empcode")
    println("Basic salary :$empbasicsalary")
    println("HRA :$hra")
    println("DA :$da")
    println("TA :$ta")
    println()
    println("Allowance :$allowance")
    println("TAX :$tax")
    println("Gross :$gross")
    println("Net Salary :$netsalary")
}
