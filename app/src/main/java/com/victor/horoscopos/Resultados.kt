package com.victor.horoscopos

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.victor.horoscopos.databinding.ActivityResultadosBinding

class Resultados : AppCompatActivity() {
    private lateinit var binding: ActivityResultadosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val anos = bundle?.getInt("anos", 0)

        val chino = 2022- anos!!

        val chino1 = (chino % 12).toInt()
        if(chino1 == 0){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.mono)
        }
        if(chino1 == 1){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.gallo)
        }
        if(chino1 == 2){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.perro)
        }
        if(chino1 == 3){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.cerdo)
        }
        if(chino1 == 4){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.rata)
        }
        if(chino1 == 5){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.buey)
        }
        if(chino1 == 6){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.tigre)
        }
        if(chino1 == 7){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.conejo)
        }
        if(chino1 == 8){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.dragon)
        }
        if(chino1 == 9){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.serpiente)
        }
        if(chino1 == 10){
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.caballo)
        }
        if(chino1 == 11) {
            binding.resultados.text = getString(R.string.edad,anos)
            binding.resultados2.text = getString(R.string.cabra)
        }


    }

    fun click(view: View) {

    }
}