package un7

import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.FileInputStream
import java.io.FileOutputStream

fun main(args : Array<String>){
    val burgers = "data.burgers"

    //Open the file in binary mode
    DataOutputStream(FileOutputStream(burgers)).use { dos ->
        with(dos){
            //Notice we have to write our data types
            writeInt("Bob is Great\n".length) //Record length of the array
            writeChars("Bob is Great\n") //Write the array
            writeBoolean(true) //Write a boolean

            writeInt("How many burgers can Bob cook?\n".length) //Record length of array
            writeBytes("How many burgers can Bob cook?\n") //Write the array
            writeInt(Int.MAX_VALUE) //Write an int

            for (i in 0..5){
                writeByte(i) //Write a byte
                writeDouble(i.toDouble()) //Write a double
                writeFloat(i.toFloat()) //Write a float
                writeInt(i) //Write an int
                writeLong(i.toLong()) //Write a long
            }
        }
    }

    //Open a binary file in read mode. It has to be read in the same order
    //in which it was written
    DataInputStream(FileInputStream(burgers)).use {dis ->
        with (dis){
            val bobSize = readInt() //Read back the size of the array
            for (i in 0 until bobSize){
                print(readChar()) //Print the array one character at a time
            }
            println(readBoolean()) //Read a boolean

            val burgerSize = readInt() //Length of the next array
            for (i in 0 until burgerSize){
                print(readByte().toChar()) //Print array one character at a time
            }
            println(readInt()) //Read an int

            for (i in 0..5){
                println(readByte()) //Read a byte
                println(readDouble()) //Read a double
                println(readFloat()) //Read a float
                println(readInt()) //Read an int
                println(readLong()) //Read a long
            }
        }

    }
}