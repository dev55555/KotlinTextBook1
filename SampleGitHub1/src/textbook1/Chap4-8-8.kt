package textbook1

fun main(args: Array<String>) {
    example_extendFunction()
}

// 拡張関数
fun example_extendFunction() {
    // Stringクラスに関数を追加してみる
    // sample1
    fun String.surround() = "[" + this + "]"
    println("Kotlin".surround())
    // sample2
    fun String.test(arg: String): Boolean{ return this.equals(arg) }
    println("Kotlin".test("Kotlin"))
}