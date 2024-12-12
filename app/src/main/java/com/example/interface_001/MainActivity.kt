package com.example.interface_001

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.interface_001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val dog = Dog()
        val cat = Cat()

        dog.makeSound() //Imprime: Woof Woof
        cat.makeSound() //Imprime Meow

        binding.tvHola.text = dog.makeSound()
        binding.tvHola2.text = cat.makeSound()
    }



}