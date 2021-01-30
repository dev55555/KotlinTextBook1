package textbook1

fun main(args: Array<String>) {
    example_as()
}

// 親クラス
open class Person(val name: String) {}
// 子クラス
class Student(name: String, var degree: String): Person(name) {}

fun example_as() {
    // 親クラス
    var person: Person = Student("Jacky", "Bachelor")
    // 子クラス
    var student: Student = person as Student

    // nullをキャスト：NullPointerExceptionが発生
//    var p: Person? = null
//    var s: Student? = p as Student
    // as?演算子：nullはnullのまま代入する
    var p: Person? = null
    var s: Student? = p as? Student

    // 異なる型へのキャスト：ClassCastExceptionが発生
    var string: String = "abc"
    var int: Int = string as Int

}

