package com.example.jcompose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jcompose.databinding.Tela02Binding

class Tela02 : AppCompatActivity() {

    lateinit var binding: Tela02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Tela02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mensagemTela01 = intent.getStringExtra("123")
        var elavai = intent.getBooleanExtra("987", false)

        binding.mensagem.text = mensagemTela01

        if(elavai){
            binding.mensagem2.text = "Ela vai"
        }else{
            binding.mensagem2.text = "Não vai"
        }

        binding.T2BtnVoltaTela01.setOnClickListener {
            /*val next = Intent(applicationContext, Tela01::class.java)
            startActivity(next)*/
            this.finish() // também volta a tela, volta uma
        }
    }
}