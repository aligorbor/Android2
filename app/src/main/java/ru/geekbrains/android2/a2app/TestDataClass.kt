package ru.geekbrains.android2.a2app

data class TestDataClass(var property1: String, var property2: String) {
    fun getCycles(): String {
        val string = StringBuilder(0)
        val propertyList = arrayListOf(property1, property2)
        for (property in propertyList)
            string.appendLine(property)
        for (i in 1..5) {
            string.appendLine(property1)
        }
        for (i in 10 downTo 1 step 2) {
            string.appendLine(property2)
        }
        for (i in 0 until propertyList.size)
            string.appendLine("${property1} ${property2}")
        return string.toString()
    }
}
