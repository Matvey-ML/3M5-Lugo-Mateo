
fun main() {
    val a : Int = addition(4 + 5, 100)
    val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) )
}
fun addition(a: Int, y: Int): Int {
    return a + y
}
fun multiplication(x: Int, b: Int): Int {
    return x * b
}