package textbook1

// 制御構造
fun main(args: Array<String>) {
    // if式の結果を取得する
    val a = 10
    val b = 20
    val max = if(a > b) {
        println("a is greater than b.")
        a
    } else {
        println("b is less than a.")
        b
    }
    println("max:${max}")

    // when式
    val c = 3
    when(c) {
        1 -> println("c == 1")
        2,3 -> println("c == 2 or 3")
        else -> println("c == else")
    }
    // in演算子
    when(c) {
//        in 1..10 -> println("c is in the range")
        !in 10..20 -> println("c is outside of the range")
        else -> println("c == else")
    }
    // 値も返せる
    val str = when(c) {
        1 -> "c == 1"
        2,3 -> "c == 2 or 3"
        else -> "c == else"
    }
    println("str:${str}")
    // 型チェック
    val anyAny: Any = "Kotlin"
    when(anyAny) {
        is Int -> println(anyAny * anyAny)
        is String -> println(anyAny.toUpperCase())
    }
    // if式の代わりに使う
    val d = 5
    when {
        d == 4 -> println("d is 4")
        (d == 5) or (d == 6) -> println("d is 5 or 6")
        else -> println("d is else")
    }

    // for文
    val arrayValue1 = arrayOf(1, 3, 5, 7)
    println("for文")
    for(i in arrayValue1) {
        println("i:${i}")
    }
    // 配列の添え字を使ったループの例
    println("配列の添え字を使ったループの例")
    for(i in arrayValue1.indices) {
        println("arrayValue1[${i}]:${arrayValue1[i]}")
    }
    // 範囲式を使ったfor文
    println("範囲式を使ったfor文")
    for(i in 1..5) {
        println("i:${i}")
    }
    println("downTo")
    for(i in 5 downTo 1) {
        println("i:${i}")
    }
    println("step")
    for(i in 1..9 step 3) {
        println("i:${i}")
    }
}