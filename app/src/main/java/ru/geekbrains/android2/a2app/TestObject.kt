package ru.geekbrains.android2.a2app

object TestObject {
    fun getCopy(dataClass: TestDataClass): String {
        val newCopy = dataClass.copy(property2 = "property2 after copy")
        return newCopy.toString()
    }
}