fun main() {
    var a : Int = 0
    var b : Int = testPassageValeur(a)

    println(a)
    println(b)

    var listA : MutableList<Int> = arrayListOf(1, 2, 3, 4, 5)
    var listB : MutableList<Int> = testPassageReference(listA)

    println(listA)
    println(listB)
    listA.add(7)
    println(listB)

}

fun testPassageValeur(a : Int ) : Int {
    return a + 2
}

fun testPassageReference(a : MutableList<Int>) : MutableList<Int>
{
    a.add(6)
    return a
}