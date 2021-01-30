package textbook1

fun main(args: Array<String>) {
    example_extendFunction()
}

// 拡張関数
fun example_extendFunction() {
    // Stringクラスに関数を追加してみる
    fun String.surround() = "[" + this + "]"
    println("Kotlin".surround())
}