package com.example.chapter3topic1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TugasMahasiswa2 : AppCompatActivity() {

   lateinit var Btnhitung : Button
    lateinit var editNama : EditText
    lateinit var editNim  :EditText
    lateinit var editUas  :EditText
    lateinit var editUts  :EditText
    lateinit var editTugas  :EditText
    lateinit var hasilNama :TextView
    lateinit var hasilNim :TextView
    lateinit var hasilUas :TextView
    lateinit var hasilUts :TextView
    lateinit var hasiltugas :TextView
    lateinit var hasiltotal :TextView
    lateinit var nilaiHuruf : TextView
    lateinit var kategori: TextView
    lateinit var hasilrata:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_mahasiswa2)

        editNama = findViewById(R.id.Nama)
        editNim = findViewById(R.id.Nim)
        editUas = findViewById(R.id.UAS)
        editUts = findViewById(R.id.UTS)
        Btnhitung=findViewById(R.id.Btn_Hitung)


        Btnhitung.setOnClickListener {
            hasilNama.text = editNama.text
            hasilNim.text = editNim.text
            val Uas = editUas.text.toString().toInt()
            val Uts = editUts.text.toString().toInt()
            val Tugas = editTugas.text.toString().toInt()
            val totalNilai = (Uas + Uts + Tugas)
            val rata = totalNilai/3

            hasilUas.text = editUas.text
            hasilUts.text = editUts.text
            hasiltugas.text=editTugas.text
            hasiltotal.text = hasiltotal.text
            hasilrata.text = rata.toFloat().toString()

            if (rata in 91..100){
                nilaiHuruf.text = "A"
            }else if (rata in 81..90){
                nilaiHuruf.text = "B"
            }else if (rata in 71..80){
                nilaiHuruf.text = "C"
            }else if (rata in 61..70){
                nilaiHuruf.text = "D"
            }else {
                nilaiHuruf.text = "E"
            }


        }

    }
}