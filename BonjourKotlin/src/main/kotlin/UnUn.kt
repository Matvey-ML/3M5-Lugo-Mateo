package org.lugo

fun main(){

    println("Entrez un chaine de nombres")
    val nombres = readln()

    println(unUn(nombres))


}
fun unUn(source: String): String{
    var result = ""
    var count = 0
    var currentChar = source[0]

    for(i in source.indices){
        if(source[i] == currentChar){
            count++
        }
        else{
            result += count.toString() + currentChar
            currentChar = source[i]
            count = 1
        }
    }
    return result
}