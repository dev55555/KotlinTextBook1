package textbook1

fun main(args: Array<String>) {
    example_null()
}

// Null安全
fun example_null() {
    // 安全呼び出し演算子：?.
    // nullの場合
    val stringVal1: String? = null
    println(stringVal1?.toString())
    println(stringVal1?.length)
    // null以外の場合
    val stringVal2: String? = "abc"
    println(stringVal2?.toString())
    println(stringVal2?.length)

    // エルビス演算子：?:
    val stringVal3: String? = null
    println(stringVal3?.length ?: 0)
    val stringVal4: String = stringVal1 ?: "this is null"
    println(stringVal4)

    // null許容型のnullチェック
    val stringVal5 : String? = "abc"
    println(stringVal5?.length)
    if(stringVal5 != null) {
        println(stringVal5.length)
    }

}