package textbook1

// スコープ関数
fun main(args: Array<String>) {
    example_scopeMethodWith()
    example_scopeMethodApply()
    example_scopeMethodLet()
    example_scopeMethodRun()
}

class Dog(val name: String) {
    var age: Int = 0
    fun message(): String {
        return "Name is ${name}. Age is ${age}."
    }
}

// with関数
fun example_scopeMethodWith() {
    // with関数未使用
    val dog: Dog = Dog("no with")
    dog.age = 14
    println(dog.message())
    // with関数の使用
    with(Dog("with")) {
        age = 12
        println(message())
    }
}

// apply関数
fun example_scopeMethodApply() {
    println(
        Dog("apply").apply {
            age = 16
        }.message()
    )
}

// let関数
fun example_scopeMethodLet() {
    // let関数未使用
    var name:String? = "Let"
    println(name?.toUpperCase())
    println(name?.length)
    // let関数使用
    name?.let {
        println(it.toUpperCase())
        println(it.length)
    }
}

// run関数
fun example_scopeMethodRun() {
    // run関数未使用
    var name:String? = "Run"
    println(name?.toUpperCase())
    println(name?.length)
    // run関数使用
    name?.run {
        println(toUpperCase())
        println(length)
    }
}