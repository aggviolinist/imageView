package com.example.daabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     lateinit var tvDescription : TextView
    lateinit var buttonUno : Button
    lateinit var imageView: ImageView
    var timesButtonPressed = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDescription = findViewById(R.id.tvDescription)
        buttonUno = findViewById(R.id.buttonUno)
        imageView = findViewById(R.id.imageView)

        buttonUno.setOnClickListener {

            timesButtonPressed ++

            when(timesButtonPressed % 3)
            {
                0 ->displayCar(Car(R.drawable.beetle,"Old school beetle "))
                1 ->displayCar(Car(R.drawable.benzo,"Mercedes Benz C class "))
                2 ->displayCar(Car(R.drawable.jeep,"Jeep Wrangler man this is a dope car"))
            }
        }
    }
    fun displayCar(car: Car)
    {
        tvDescription.text = car.description
        imageView.setImageResource(car.image)

    }
    data class Car(val image:Int, val description:String)
}