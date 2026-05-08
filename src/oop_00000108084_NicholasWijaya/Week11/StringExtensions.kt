package oop_00000108084_NicholasWijaya.Week11

//Extension function dengan reciver 'this'
fun String.addGreeting(): String {
    return "Hello $this"
}

// Extention function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}