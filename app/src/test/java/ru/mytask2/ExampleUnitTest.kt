package ru.mytask2

import org.junit.Test

import org.junit.Assert.*
import java.lang.IllegalArgumentException

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    var collection = listOf(
        User("Bart", 20, 45323),
        User("Tom", 17, 54223),
        User("Nik", 32, 543312),
        User("Max", 18, 432423)
    )


    @Test
    fun start() {
        println(collection)
        println(collection.sort("age"))
    }

    fun List<User>.sort(parameter: String): List<User> {
        collection = when (parameter) {
            "age" -> collection.sortedBy(User::age)
            else -> throw IllegalArgumentException("")
        }
        return collection
    }
}