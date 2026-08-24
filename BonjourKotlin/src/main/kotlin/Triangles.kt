package org.lugo

fun main(){
    println("Entrez l'hauteur du triangle")
    val hauteur = readln().toInt()

    for(i in 1..5){ println(triangles(hauteur)) }
}

fun triangles(hauteur : Int) : String{
    val sb  = StringBuilder()
    for(i in 1..hauteur){
        for(i in 1..i){ sb.append("*") }
        sb.append("\n")
    }
    return sb.toString()
}