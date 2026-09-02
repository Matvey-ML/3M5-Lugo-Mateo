

```
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
```


| ligne exécutée                                                             | effet                                                 | pile d'appels           |
|----------------------------------------------------------------------------|-------------------------------------------------------|-------------------------|
| val a : Int = addition(4 + 5, 100)                                         | appelle addition avec a = 9 et y = 100                | main                    |
| return a + y                                                               | a: 9, b: 100; retourne 109                            | addition<br/>main       |
| val a : Int = addition(4 + 5, 100)                                         | a: 109                                                | main                    |
| val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) ) | a: 109, appelle multiplication avec x = 4 et b = 109  | main                    |
| return x * b                                                               | x: 4, b: 109; retourne 436                            | multiplication<br/>main |
| val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) ) | a: 109; appelle multiplication avec x = 2 et b = 3    | main                    |
| return x * b                                                               | x : 2, b :3; retourne 6                               | multiplication<br/>main |
| val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) ) | a: 109; appelle multiplication avec x = 436, et b = 6 | main                    |
| return x * b                                                               | x: 436, b: 6; retourne 2616                           | multiplication<br/>main |
| val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) ) | a: 109, b: 2616                                       | main                    |
