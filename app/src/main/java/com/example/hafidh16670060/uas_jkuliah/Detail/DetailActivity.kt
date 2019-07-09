package com.example.hafidh16670060.uas_jkuliah.Detail

import android.R
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {
    private var namaMakul:String= ""
    private var kodeMakul:String= ""
    private var namaDosen:String= ""
    private var Ruang:String= ""
    private var Waktu:String= ""
    private var Sks1:String= ""
    private var KodeKelas:String= ""

    private lateinit var nama_mk :TextView
    private lateinit var kode_mk :TextView
    private lateinit var nama_dosen :TextView
    private lateinit var nama_ruang :TextView
    private lateinit var waktu :TextView
    private lateinit var sks1 :TextView
    private lateinit var kode_kelas :TextView

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout{
            lparams(width= matchParent, height = matchParent)
            orientation = LinearLayout.VERTICAL
            padding = dip(16)
            background = ColorDrawable(Color.parseColor("#FF00CCFF"))

            nama_mk = textView {
                textSize =30f
                gravity = Gravity.CENTER
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

            nama_dosen = textView {
                textSize =20f
                gravity = Gravity.CENTER
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)
            textView {
                text = "Kode Mata Kuliah"
                textSize =20f
                gravity = Gravity.LEFT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent){
                topMargin=dip(10)
            }

            kode_mk = textView {
                textSize =15f
                gravity = Gravity.RIGHT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

            textView {
                text = "Ruang Kuliah"
                textSize =20f
                gravity = Gravity.LEFT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent){
                topMargin=dip(10)
            }

            nama_ruang = textView {
                textSize =15f
                gravity = Gravity.RIGHT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

            textView {
                text = "Waktu"
                textSize =20f
                gravity = Gravity.LEFT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent){
                topMargin=dip(10)
            }

            waktu = textView {
                textSize =15f
                gravity = Gravity.RIGHT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

            textView {
                text = "Jumlah SKS"
                textSize =20f
                gravity = Gravity.LEFT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent){
                topMargin=dip(10)
            }
            sks1 = textView {
                textSize =15f
                gravity = Gravity.RIGHT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

            textView {
                text = "Kode Kelas"
                textSize =20f
                gravity = Gravity.LEFT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent){
                topMargin=dip(10)
            }
            kode_kelas = textView {
                textSize =15f
                gravity = Gravity.RIGHT
                background = ColorDrawable(Color.parseColor("#FFFFFFFF"))
                textColor = resources.getColor(R.color.black)
            }.lparams(height= wrapContent, width = matchParent)

        }
        val i = intent
        namaMakul= i.getStringExtra("NAMA_MAKUL")
        kodeMakul= i.getStringExtra("KODE_MAKUL")
        namaDosen= i.getStringExtra("NAMA_DOSEN")
        Ruang= i.getStringExtra("RUANG")
        Waktu = i.getStringExtra("WAKTU")
        Sks1 = i.getStringExtra("SKS1")
        KodeKelas=i.getStringExtra("KODE_KELAS")

        nama_mk.text=namaMakul
        kode_mk.text=kodeMakul
        nama_dosen.text=namaDosen
        nama_ruang.text=Ruang
        waktu.text=Waktu
        sks1.text=Sks1
        kode_kelas.text=KodeKelas



    }
}
