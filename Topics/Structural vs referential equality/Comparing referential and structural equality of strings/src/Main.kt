fun main() {
    data class Str(val str: String)
//    data class User(val name: String)

//    val str1 = User("John")
//    val str2 = User("John")
    val str1 = Str("kotlin")
    val str2 = Str("kotlin")



    if (str1 === str2) {
        println("str1 and str2 have the same reference.\n")
    } else {
        println("str1 and str2 do not have the same reference.\n")
    }
    if (str1 == str2) {
        println("str1 and str2 have the same structural equality.\n")
    } else {
        println("str1 and str2 do not have the same structural equality.\n")
    }
}