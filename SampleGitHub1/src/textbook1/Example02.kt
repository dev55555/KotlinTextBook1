package textbook1

// 変数と型2
fun main(args: Array<String>) {
    // 型の変換
    val str64: String = "64"
    val int64: Int = str64.toInt()
    println("int64:$int64")
    // 失敗例(NumberFormatException)
//    val intA: Int = "A".toInt()
    // orNullメソッド
    val intA: Int? = "A".toIntOrNull()
    println("intA:$intA")

    // 配列の生成
    val arrayOfInt: Array<Int> = arrayOf(1,2,3,5,7)
    for(i in arrayOfInt) {
        println("i:$i")
    }
}