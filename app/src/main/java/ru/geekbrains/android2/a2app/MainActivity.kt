package ru.geekbrains.android2.a2app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        val button1 = findViewById<Button>(R.id.button1)
        val text1 = findViewById<TextView>(R.id.text1)
        button1.setOnClickListener {
            text1.text = getString(R.string.hello)
        }
        val button2 = findViewById<Button>(R.id.button2)
        val textProperty1 = findViewById<TextView>(R.id.textProperty1)
        val textProperty2 = findViewById<TextView>(R.id.textProperty2)
        val testDataClass = TestDataClass("Hello", "Kotlin!!!")
        button2.setOnClickListener {
            if (!textProperty1.text.isEmpty())
                testDataClass.property1 = textProperty1.text.toString()
            if (!textProperty2.text.isEmpty())
                testDataClass.property2 = textProperty2.text.toString()
            "data class with properties:  ${testDataClass.property1} ${testDataClass.property2}".also { text1.text = it }
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            TestObject.getCopy(testDataClass).also { text1.text = it }
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            testDataClass.getCycles().also { text1.text = it }
        }
    }
}

