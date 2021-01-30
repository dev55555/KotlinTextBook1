package textbook1

fun main(args: Array<String>) {
    example_is()
}

fun example_is() {
    // is演算子
    val itemInt: Int = 1
    println(itemInt is Int)

    // スマートキャスト
    val itemAnyString: Any = "abcde"
    example_smartCast(itemAnyString)
    val itemAnyInt: Any = 15
    example_smartCast(itemAnyInt)
}

fun example_smartCast(obj: Any) {
    when(obj) {
        is String -> {
            println("String")
            println("obj.length is [${obj.length}]")
        }
        is Int -> {
            println("Int")
            println("obj is [$obj]")
        }
        else -> println("else")
    }
}
