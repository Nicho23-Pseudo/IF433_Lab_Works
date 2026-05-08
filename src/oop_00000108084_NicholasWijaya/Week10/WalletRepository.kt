package oop_00000108084_NicholasWijaya.Week10

interface NamedEntity {
    val name: String
}

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is NamedEntity && it.name.contains(keyword, ignoreCase = true)
        }
    }
}