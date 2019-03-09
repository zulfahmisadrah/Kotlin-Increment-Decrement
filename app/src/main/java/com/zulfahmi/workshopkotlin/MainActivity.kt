package com.zulfahmi.workshopkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var angka = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener{
            tambah()
        }

        btn_kurang.setOnClickListener(){
            kurang()
        }

        btn_reset.setOnClickListener{
            reset()
        }
    }

    private fun tambah(){
        angka++
        var strAngka = angka.toString()
        tv_angka.text = strAngka
    }

    private fun kurang(){
        if (angka>0){
            angka--
            var strAngka = angka.toString()
            tv_angka.text = strAngka
        }else{
            Toast.makeText(this, "Tidak Bisa Negatif", Toast.LENGTH_SHORT).show()
        }
    }

    private fun reset(){
        angka = 0;
        var strAngka = angka.toString()
        tv_angka.text = strAngka;
    }
}
