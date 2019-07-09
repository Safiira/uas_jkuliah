package com.example.hafidh16670060.uas_jkuliah.Main

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.hafidh16670060.uas_jkuliah.R
import com.example.hafidh16670060.uas_jkuliah.Model.DataItem
import com.example.hafidh16670060.uas_jkuliah.R.id.iNama as Nama
import com.example.hafidh16670060.uas_jkuliah.R.id.iNpm as npm
import com.example.hafidh16670060.uas_jkuliah.R.id.iTlhr as tgllhr
import com.example.hafidh16670060.uas_jkuliah.R.id.iKtlhr as ktlhr
import com.example.hafidh16670060.uas_jkuliah.R.id.iEmail as email
import org.jetbrains.anko.*

class DataDiriAdapter(private val result: List<DataItem>, private val listener: (DataItem) ->Unit)
    : RecyclerView.Adapter<DataViewHolder1>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder1 {
        return DataViewHolder1(DataDiriUI().createView(AnkoContext.Companion.create(parent.context, parent)))
    }

    override fun getItemCount(): Int = result.size

    override fun onBindViewHolder(holder: DataViewHolder1, position: Int) {
        holder.bindItem1(result[position], listener)
    }
}

class DataDiriUI : AnkoComponent<ViewGroup> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){
            linearLayout {
                lparams(width = matchParent, height = wrapContent)
                orientation = LinearLayout.VERTICAL

                imageView {
                    imageResource = R.drawable.odiba
                }.lparams(width = matchParent, height = 500)

                textView {
                    id = Nama
                    textSize = 20f
                    topPadding = dip(20)
                    gravity = Gravity.CENTER
                    textColor = Color.BLACK
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    text = "NPM".toString()
                    textSize = 20f
                    topPadding = dip(20)
                    textColor = Color.BLACK

                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    id = npm
                    textSize = 20f
                    textColor = Color.BLACK
                    background=ColorDrawable(Color.parseColor("#FF00CCFF"))
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    text = "Tanggal Lahir".toString()
                    textSize = 20f
                    topPadding = dip(20)
                    textColor = Color.BLACK
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    id = tgllhr
                    textSize = 20f
                    textColor = Color.BLACK
                    background=ColorDrawable(Color.parseColor("#FF00CCFF"))
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    text = "Kota Lahir".toString()
                    textSize = 20f
                    topPadding = dip(20)
                    textColor = Color.BLACK
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    id = ktlhr
                    textSize = 20f
                    textColor = Color.BLACK
                    background=ColorDrawable(Color.parseColor("#FF00CCFF"))
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    text = "Email".toString()
                    textSize = 20f
                    topPadding = dip(20)
                    textColor = Color.BLACK
                }.lparams(height = wrapContent, width = matchParent)

                textView {
                    id = email
                    textSize = 20f
                    textColor = Color.BLACK
                    background=ColorDrawable(Color.parseColor("#FF00CCFF"))
                }.lparams(height = wrapContent, width = matchParent)
            }

        }
    }
}
class DataViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
    private val iNama: TextView = view.find(Nama)
    private val iNpm:TextView = view.find(npm)
    private val iTlhr:TextView = view.find(tgllhr)
    private val iKtlhr:TextView = view.find(ktlhr)
    private val iEmail:TextView = view.find(email)
    fun bindItem1(dataitem: DataItem, listener: (DataItem) -> Unit){
        iNama.text = dataitem.nama
        iNpm.text = dataitem.npm
        iTlhr.text = dataitem.tlhr
        iKtlhr.text = dataitem.ktlhr
        iEmail.text = dataitem.email
    }
}