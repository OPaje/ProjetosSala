package com.example.jcompose

import android.content.Entity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jcompose.databinding.Tela01Binding

class Tela01 : AppCompatActivity() {

    lateinit var binding : Tela01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Tela01Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnChamaTela02.setOnClickListener {
            val next = Intent(applicationContext, Tela02::class.java) // applicationContext é igual ao this
            val parametro = Bundle() // serve para passar parâmetro para outro tela
            parametro.putString("123", "Demoniela!")
            parametro.putInt("321", 8)

            if(binding.T1CbDomingo.isChecked){
                parametro.putBoolean("987", true)
            }

            next.putExtras(parametro)
            startActivity(next)

        }

    }
}