package org.lugo

fun main(){
    println(repete(10,3))
    println(repete(2,200))
    println(repete(100,100))
}
fun repete(n: Int, nombreFois: Int): List<Int>{
    val nombres : MutableList<Int> = mutableListOf()
    for (i in 1..n){
        for(f in 1 .. nombreFois){
            nombres.add(i)
        }
    }
    return nombres
}