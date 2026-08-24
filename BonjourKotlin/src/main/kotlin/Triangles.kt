package org.lugo

fun main(){
    println("Entrez l'hauteur du triangle")
    val hauteur = readln().toInt()

    for(i in 1..5){
        println(triangles(hauteur))
    }

}

fun triangles(hauteur : Int) : String{
    var largeur = 1
    val sb  = StringBuilder()

    for(i in 1..hauteur){
        for(i in 1..largeur){
            sb.append("*")
        }
        sb.append("\n")
        largeur++
    }
    return sb.toString()
}