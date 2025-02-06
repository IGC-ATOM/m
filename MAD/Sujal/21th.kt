package com.example.myapplication

fun main(){
    //Write a menu driven Kotlin program to provide a list of options to the user for finding the area of Circle, Square, Triangle and Cylinder. Perform appropriate operation as selected by the user.
    do {
        println("Enter ur choice :")
        println("1) Area of Circle")
        println("2) Area of Square")
        println("3) Area of Triangle")
        println("4) Area of Cylinder")
        println("5) Exit")
        var choice= readLine()?.toInt()?:0

        when(choice){
            1->{
                println("Calculating Area of Circle :")
                print("Enter Radius :")
                var rad= readLine()?.toInt()?:0
                println("Area of Circle : ${3.14*rad*rad}")

            }
            2->{
                println("Calculating Area of Square :")
                println("Enter Side :")
                var s= readLine()?.toInt()?:0
                println("Area of Square :${s * s }")
            }
            3->{
                println("Calculating Area of Triangle :")
                println("Enter Breadth :")
                var b= readLine()?.toInt()?:0
                println("Enter height :")
                var h= readLine()?.toInt()?:0
                println("Area of Triangle :${0.5*b*h}")
            }
            4->{

                println("Calculating Area of Cylinder :")
                println("Enter radius :")
                var r= readLine()?.toInt()?:0
                println("Enter height :")
                var h= readLine()?.toInt()?:0
                println("Area of Triangle :${2*3.14*r*h+2*3.14*r*r}")
            }


        }
    }while (choice<=4)
}