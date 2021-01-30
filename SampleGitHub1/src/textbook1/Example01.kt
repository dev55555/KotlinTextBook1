package textbook1

// 変数と型1
fun main(args: Array<String>) {
    // 変数
    var ex01 = 10
    println("ex01:$ex01")
    ex01 = 20
    println("ex01:$ex01")
    // 定数
    val ex02 = 100
    println("ex02:$ex02")
    // ex02 = 10 // コンパイルエラー

    // 複数行文字列
    val ex11 = """複数行
        |の
        |文字列
    """.trimMargin()
    println("ex11:$ex11")

    // 文字列の比較(==で可能)
    val ex12 = "文字列"
    if(ex12 == "文字列") {
        println("ex12:true")
    } else {
        println("ex12:false")
    }

    //　文字列テンプレート
    val ex13 = "テンプレート"
    println("ex13:[${ex13}]の文字数は、${ex13.length}文字です。")
}