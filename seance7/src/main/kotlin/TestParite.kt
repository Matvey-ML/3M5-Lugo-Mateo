
fun main (){
    println("Entrez nombre")
    val nombre : Int = readln().toInt()
    println(parite(nombre))
}
fun parite(a : Int) : Boolean{
    return a % 2 == 0
}