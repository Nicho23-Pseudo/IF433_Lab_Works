package oop_00000108084_NicholasWijaya.Week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val databse = MySQLDatabase() // Hard-coded! Tightly coupled!
    fun getUser(id: Int) = databse.query("SELECT * FROM users WHERE id = $id")
}