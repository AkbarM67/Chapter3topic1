package com.example.chapter3topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var BtnHitung : Button
    lateinit var edumur :EditText
    lateinit var edtinggi :EditText
    lateinit var edBB :EditText
    lateinit var hasilUmur :TextView
    lateinit var hasilTinggi :TextView
    lateinit var hasilBB :TextView
    lateinit var hasilBMI :TextView
    lateinit var hasilkategori :TextView
    lateinit var Reset :Button
    lateinit var BtnTkedua : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     // pemanggilan id view dari xml
        edumur = findViewById(R.id.editUmur)
        edtinggi=findViewById(R.id.editTB)
        edBB = findViewById(R.id.editBB)
        BtnHitung=findViewById(R.id.Btn_Hitung)
        hasilUmur= findViewById(R.id.Umurhasil)
        hasilTinggi= findViewById(R.id.tinggiHasil)
        hasilBB=findViewById(R.id.BBHasil)
        hasilBMI=findViewById(R.id.BMIHasil)
        hasilkategori=findViewById(R.id.KategoriHasil)
        Reset = findViewById(R.id.Btn_Reset)



            //kasih event onclick
        edumur.setOnClickListener{}
        edtinggi.setOnClickListener{}
        edBB.setOnClickListener{}
        Reset.setOnClickListener {
            ResetData()
        }

        BtnHitung.setOnClickListener {
            hasilUmur.text = edumur.text
            var TinggiBadan = edtinggi.text.toString().toDouble()/100
            var BeratBadan = edBB.text.toString().toInt()
            var BMI = (BeratBadan / (TinggiBadan*TinggiBadan))

            hasilTinggi.text = edtinggi.text
            hasilBB.text=edBB.text
            hasilBMI.text = BMI.toFloat().toString()


            val Kategori : String
            if (BMI < 16.0){
                Kategori = "Terlalu Kurus"
            }else if (BMI in 16.0..17.0) {
                Kategori = "Cukup Kurus"
            }else if (BMI in 17.0..18.5) {
                Kategori = "sedikit kurus"
            }else if (BMI in 18.5..25.0) {
                Kategori = "Normal"
            }else if (BMI in 25.0..30.0){
                Kategori = "Gemuk"
            }else if (BMI in 30.0..35.0){
                Kategori = "Obesitas Kelas 1"
            }else if (BMI in 35.0..40.0) {
                Kategori = "Obesitas kelas 2"
            }else if (BMI > 40 ) {
                Kategori = "Obesitas Kelas 3"
            }else Kategori = "Tidak falid "
            hasilkategori.text = Kategori
        }
        IntentkeHome()

        }
    fun ResetData(){
        edumur.setText(null)
        edtinggi.setText(null)
        edBB.setText(null)

        hasilUmur.setText(null)
        hasilTinggi.setText(null)
        hasilBB.setText(null)
        hasilBMI.setText(null)
        hasilkategori.setText(null)


        }

    fun IntentkeHome(){
        BtnTkedua = findViewById(R.id.klick_tugas2)
        BtnTkedua.setOnClickListener {
            val pindah = Intent(this,TugasMahasiswa2::class.java)
            startActivity(pindah)
        }
    }
    }
