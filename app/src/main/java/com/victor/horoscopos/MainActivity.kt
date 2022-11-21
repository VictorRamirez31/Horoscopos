package com.victor.horoscopos

//Para la fecha
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import com.victor.horoscopos.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun click(view: View) {

        val intent = Intent(this, Resultados::class.java)
        //startActivity(Intent(this, Resultados::class.java))
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP


        if(binding.editNombre.text.isNotEmpty()){


        }else{
            makeText(this@MainActivity, getString(R.string.error), LENGTH_SHORT).show()
            binding.editNombre.error = getString(R.string.obligatorio)
        }
        if(binding.fecha.text.isNotEmpty()){

            val fecha = binding.fecha.text.toString()
            lateinit var nacimiento: Date
            try{
                nacimiento = SimpleDateFormat("dd/MM/yyyy").parse(fecha)
            } catch (e: Exception){
                makeText(this@MainActivity, getString(R.string.error), LENGTH_SHORT).show()
            }
            val intent = Intent(this, Resultados::class.java)
            //startActivity(Intent(this, Resultados::class.java))
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP



            val fechaActual = Date(System.currentTimeMillis())
            val diferenciaFechaMilisegundos = fechaActual.getTime()-nacimiento.getTime()
            val segundos = diferenciaFechaMilisegundos/1000
            val minutos = segundos/60
            val horas = minutos/60
            val dias = horas/24
            val anos = dias/365

            val parametros = Bundle()
            parametros.putInt("anos", anos.toInt())
            intent.putExtras(parametros)
            startActivity(intent)

        }else{
            makeText(this,getString(R.string.error), LENGTH_SHORT).show()
            binding.fecha.error = getString(R.string.obligatorio)
        }
        if (binding.editCuenta.text.isNotEmpty()){

        }else{
            makeText(this,getString(R.string.error), LENGTH_SHORT).show()
            binding.editCuenta.error = getString(R.string.obligatorio)
        }
        if (binding.editCorreo.text.isNotEmpty()){

        }else{
            makeText(this,getString(R.string.error), LENGTH_SHORT).show()
            binding.editCorreo.error = getString(R.string.obligatorio)


        }
    }

}