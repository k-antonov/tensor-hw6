package com.example.tensorhw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tensorhw6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mike = Employee(
            name = "Эрмантраут Михаил Петрович",
            photoImageId = R.drawable.mike,
            experience = "5 лет 2 месяца",
            position = "Ведущий инженер-программист (3 категории, моб.)",
            location = "Альбукерке",
            dateOfBirth = "11.08.1944",
            phone = "8-800-555-35-35",
            email = "mikey@gmail.com"
        )
        mike.isOnline = true

        inflateCard(mike)

        binding.messageButton.setOnClickListener {
            Toast.makeText(
                this, "Вызов интерфейса для отправки сообщения",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.phoneButton.setOnClickListener {
            Toast.makeText(
                this, "Вызов интерфейса для звонка",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun inflateCard(employee: Employee) {
        binding.name.text = employee.name
        binding.photo.setImageResource(employee.photoImageId)
        binding.experienceValue.text = employee.experience
        binding.position.text = employee.position
        binding.location.text = employee.location
        binding.dateOfBirth.text = employee.dateOfBirth
        binding.phone.text = employee.phone
        binding.email.text = employee.email

        if (employee.isOnline) {
            binding.isOnlineText.setText(R.string.online)
            binding.isOnlineIcon.setImageResource(R.drawable.online)
        } else {
            binding.isOnlineText.setText(R.string.offline)
            binding.isOnlineIcon.setImageResource(R.drawable.offline)
        }
    }

}