fun main() {
    val user = setUSer("Ridho", "Bermain game", 15)
    println(user)

    printUser("Ridho", hobby = "Bermain game", age = 15)
}

fun setUSer(name: String, hobby: String, age: Int) = "My name is $name, My hobby is $hobby, and my age is $age years old"

fun printUser(name: String, hobby: String, age: Int) {
    println("My name is $name, my hobby is $hobby, and my age is $age years old")
}
