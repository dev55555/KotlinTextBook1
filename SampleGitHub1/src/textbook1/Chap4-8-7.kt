package textbook1

fun main(args: Array<String>) {
    example_Pair()
}

// Pair
fun example_Pair() {
    // Pairの作り方(コンストラクタを使用)
    val p1 = Pair("apple", 101)
    println("first is ${p1.first} and second is ${p1.second}")

    // Pairの作り方(to構文を使用)
    val p2 = "banana" to 102
    println("first is ${p2.first} and second is ${p2.second}")
}