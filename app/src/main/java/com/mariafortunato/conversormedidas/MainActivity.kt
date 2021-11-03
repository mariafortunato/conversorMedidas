package com.mariafortunato.conversormedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.mariafortunato.conversormedidas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lista = arrayListOf("Escolha a conversão", "m -> cm", "m -> km","m -> hm", "m -> dam", "m -> dm", "m -> mm",
                                "cm -> M", "cm -> km", "cm -> hm", "cm -> dam", "cm -> dm", "cm -> mm",
                                "km -> m", "km -> cm", "km -> hm", "km -> dam", "km -> dm", "km -> mm",
                                "hm -> m", "hm -> km","hm -> cm","hm -> dam","hm -> dm","hm -> mm",
                                "dam -> m", "dam -> km", "dam -> cm", "dam -> hm", "dam -> dm", "dam -> mm",
                                "dm -> m", "dm -> km", "dm -> cm", "dm -> hm", "dm -> dam", "dm -> mm",
                                "mm -> mm", "mm -> km", "mm -> cm", "mm -> hm", "mm -> dam", "mm -> dm")
        val spnAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lista)
        binding.spn.adapter = spnAdapter

        binding.btnConversor.setOnClickListener {
            val editMedida = binding.editMedida.text.toString().trim()
            val txtResultado = binding.txtResultado.text
            val spn = binding.spn.selectedItem
            val btn = binding.btnConversor.text

            if (editMedida.isEmpty()){
                binding.editMedida.error = "Preencha o campo corretamente"
                binding.editMedida.requestFocus()
            }else if (spn == lista[0]){
                Toast.makeText(this, "Informe o tipo de conversão!", Toast.LENGTH_LONG).show()
            } else {
                if (spn == lista[1]){
                    val cm = editMedida.toDouble() * 100
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$cm cm "
                } else if (spn == lista[2]){
                    val km = editMedida.toDouble() / 1000
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$km km"
                } else if(spn == lista[3]){
                    val hm = editMedida.toDouble() / 100
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$hm hm"
                } else if(spn == lista[4]){
                    val dam = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$dam dam"
                } else if(spn == lista[5]){
                    val dm = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$dm dm"
                } else if(spn == lista[6]){
                    val mm = editMedida.toDouble() * 1000
                    binding.txtResultado.text = "Conversão: $editMedida m \né equivalente a \n$mm mm"
                } else if (spn == lista[7]){
                    val m = editMedida.toDouble() / 100
                    binding.txtResultado.text = "Conversão: $editMedida cm \né equivalente a \n$m m"
                } else if (spn == lista[8]){
                    val km = editMedida.toDouble() / 100000
                    binding.txtResultado.text = "Conversão: $editMedida cm \né equivalente a \n$km km"
                } else if (spn == lista[9]){
                    val hm = editMedida.toDouble() / 10000
                    binding.txtResultado.text = "Conversão: $editMedida cm \né quivalente a \n$hm hm"
                } else if (spn == lista[10]){
                    val dam = editMedida.toDouble() / 1000
                    binding.txtResultado.text = "Conversão: $editMedida cm \né equivalente a \n$dam dam"
                } else if (spn == lista[11]){
                    val dm = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida cm \né equivalente a \n$dm dm"
                } else if (spn == lista[12]){
                    val mm = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida cm \né equivalente a \n$mm mm"
                } else if (spn == lista[13]){
                    val m = editMedida.toDouble() * 1000
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$m m"
                } else if (spn == lista[14]){
                    val cm = editMedida.toDouble() * 100000
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$cm cm"
                } else if (spn == lista[15]){
                    val hm = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$hm hm"
                } else if (spn == lista[16]){
                    val dam = editMedida.toDouble() * 100
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$dam dam"
                } else if (spn == lista[17]){
                    val dm = editMedida.toDouble() * 10000
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$dm dm"
                } else if (spn == lista[18]){
                    val mm = editMedida.toDouble() * 1000000
                    binding.txtResultado.text = "Conversão: $editMedida km \né equivalente a \n$mm mm"
                } else if (spn == lista[19]){
                    val m = editMedida.toDouble() * 100
                    binding.txtResultado.text = "Conversão: $editMedida hm \né equivalente a \n$m m"
                } else if (spn == lista[20]){
                    val km = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida hm \né equivalente a \n$km km"
                }else if (spn == lista[21]){
                    val cm = editMedida.toDouble() * 10000
                    binding.txtResultado.text = "$editMedida hm \né equivalente a \n$cm cm"
                } else if (spn == lista[22]){
                    val dam = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida hm \né equivalente a \n$dam dam"
                } else if (spn == lista[23]){
                    val dm = editMedida.toDouble() * 1000
                    binding.txtResultado.text = "Conversão: $editMedida hm \né equivalente a \n$dm dm"
                } else if (spn == lista[24]){
                    val mm = editMedida.toDouble() * 100000
                    binding.txtResultado.text = "Conversão: $editMedida hm \né equivalente a \n$mm mm"
                } else if (spn == lista[25]){
                    val m = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$m m"
                } else if (spn == lista[26]){
                    val km = editMedida.toDouble() / 100
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$km km"
                } else if (spn == lista[27]){
                    val cm = editMedida.toDouble() * 1000
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$cm cm"
                } else if (spn == lista[28]){
                    val hm = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$hm hm"
                } else if (spn == lista[29]){
                    val dm = editMedida.toDouble() * 100
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$dm dm"
                } else if (spn == lista[30]){
                    val mm = editMedida.toDouble() * 10000
                    binding.txtResultado.text = "Conversão: $editMedida dam \né equivalente a \n$mm mm"
                } else if (spn == lista[31]){
                    val m = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida dm \né equivalente a \n$m m"
                } else if (spn == lista[32]){
                    val km = editMedida.toDouble() / 10000
                    binding.txtResultado.text = "Conversão: $editMedida dm \né equivalente a \n$km km"
                } else if (spn == lista[33]){
                    val cm = editMedida.toDouble() * 10
                    binding.txtResultado.text = "Conversão: $editMedida dm \né equivalente a \n$cm cm"
                } else if (spn == lista[34]){
                    val hm = editMedida.toDouble() / 1000
                    binding.txtResultado.text = "Conversão: $editMedida dm \né equivalente a \n$hm hm"
                } else if (spn == lista[35]){
                    val dam = editMedida.toDouble() / 100
                    binding.txtResultado.text = "Conversão: $editMedida dm \né equivalente a \n$dam dam"
                } else if (spn == lista[36]){
                    val mm = editMedida.toDouble() * 100
                    binding.txtResultado.text = "Conversão: $editMedida dm \n é equivalente a \n$mm mm"
                } else if (spn == lista[37]){
                    val m = editMedida.toDouble() / 1000
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$m m"
                } else if (spn == lista[38]){
                    val km = editMedida.toDouble() / 1000000
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$km km"
                } else if (spn == lista[39]){
                    val cm = editMedida.toDouble() / 10
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$cm cm"
                } else if (spn == lista[40]){
                    val hm = editMedida.toDouble() / 100000
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$hm hm"
                } else if (spn == lista[41]){
                    val dam = editMedida.toDouble() / 10000
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$dam dam"
                } else if (spn == lista[42]){
                    val dm = editMedida.toDouble() / 100
                    binding.txtResultado.text = "Conversão: $editMedida mm \né equivalente a \n$dm dm"
                }

            }
        }
        binding.imgBtnExclamacao.setOnClickListener {
            val txt = binding.txtResultado.text
            binding.txtResultado.text = " km - Quilõmetro \n hm - Hectõmetro \n dam - Decãmetro \n m - Metro \n dm - Decímetro \n cm - Centímetro \n mm - Milímetro"
        }

    }
}