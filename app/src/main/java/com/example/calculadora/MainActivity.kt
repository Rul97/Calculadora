package com.example.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sumar.setOnClickListener {
            try {
                val numero1 = binding.primeraEntrada.text.toString().toFloat()
                val numero2 = binding.segundaEntrada.text.toString().toFloat()
                val resultado = numero1 + numero2
                binding.resultado.text = resultado.toString()
            } catch (e: NumberFormatException) {
                binding.resultado.text = "Por favor, ingresa números válidos."
            }
        }
        binding.restar.setOnClickListener{
            try {
                val numero1 = binding.primeraEntrada.text.toString().toFloat()
                val numero2 = binding.segundaEntrada.text.toString().toFloat()
                val resultado = numero1 - numero2
                binding.resultado.text = resultado.toString()
            } catch (e: NumberFormatException) {
                binding.resultado.text = "Por favor, ingresa números válidos."
            }
        }

        binding.multiplicar.setOnClickListener{
            try {
                val numero1 = binding.primeraEntrada.text.toString().toFloat()
                val numero2 = binding.segundaEntrada.text.toString().toFloat()
                val resultado = numero1 * numero2
                binding.resultado.text = resultado.toString()
            } catch (e: NumberFormatException) {
                binding.resultado.text = "Por favor, ingresa números válidos."
            }
        }

        binding.dividir.setOnClickListener{
            try {
                val numero1 = binding.primeraEntrada.text.toString().toFloat()
                val numero2 = binding.segundaEntrada.text.toString().toFloat()
                if (numero2 != 0f) {
                    val resultado = numero1 / numero2
                    binding.resultado.text = resultado.toString()
                } else {
                    binding.resultado.text = "No se puede dividir por cero."
                }
            } catch (e: NumberFormatException) {
                    binding.resultado.text = "Por favor, ingresa números válidos."
            }
        }
        binding.reset.setOnClickListener{
                binding.primeraEntrada.setText("")
                binding.segundaEntrada.setText("")
                binding.resultado.text = ""
        }
    }
 }
