````
fun main() {    
var a : Int = 0    
var b : Int = testPassageValeur(a)

    println(a)
    println(b)    

    var listA : MutableList<Int> = arrayListOf(1, 2, 3, 4, 5)    
    var listB : MutableList<Int> = testPassageReference(listA)

    println(listA)
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
````

| Ligne exécutée                                              | effet                                                                          | pile d'appels                 |
|-------------------------------------------------------------|--------------------------------------------------------------------------------|-------------------------------|
| var a : Int = 0                                             | a: 0                                                                           | main                          |
| var b : Int = testPassageValeur(a)                          | a: 0, appelle testPassageValeur avec 0 = a                                     | main                          |
| return a + 2                                                | a: 0, retourne 2                                                               | testPassageValeur<br/>main    |
| println(a)                                                  | a: 0 b: 2, affiche 0                                                           | main                          |
| println(b)                                                  | a: 0 b: 2, affiche 2                                                           | main                          |
| var listA : MutableList<Int> = arrayListOf(1, 2, 3, 4, 5)   | a: 0 b:2 listA : (1,2,3,4,5)                                                   | main                          |
| var listB : MutableList<Int> = testPassageReference(listA)  | a: 0 b:2 listA : (1,2,3,4,5), appelle testPassageReference avec a = (1,2,3,4,5)| main                          |
| a.add(6)                                                    | a: (1,2,3,4,5,6)                                                               | testPassageReference<br/>main |
| return a                                                    | a: (1,2,3,4,5,6), retourne (1,2,3,4,5,6)                                       | testPassageReference<br/>main |
| println(listA)                                              | a: 0 b: 2 listA:(1,2,3,4,5,6) listB:(1,2,3,4,5,6) affiche (1,2,3,4,5,6)        | main                          |
| println(listB)                                              | a: 0 b: 2 listA:(1,2,3,4,5,6) listB:(1,2,3,4,5,6) affiche (1,2,3,4,5,6)        | main                          |

listeA et listeB sont de types référence, chacun pointe vers un objet en memoire, lorsque on passe la référence dans la fonction la nouvelle liste générée dans la fonction fait
référence au même objet de la listeA et donc n'importe quel changement affectera l'objet et donc changera la valeur aussi
dans listeA et listeB féra référence aussi a listeA