package com.example.hafidh16670060.uas_jkuliah.Main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.hafidh16670060.uas_jkuliah.Model.DataItem
import com.example.hafidh16670060.uas_jkuliah.rest_api.ApiRepository
import com.example.hafidh16670060.uas_jkuliah.rest_api.ApiRepositoryDD
import com.google.gson.Gson
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class DataDiri : AppCompatActivity(),MainView{
    private lateinit var presenter: MainPresenter
    private lateinit var adapter: DataDiriAdapter
    private var result: MutableList<DataItem> = mutableListOf()
    private lateinit var listData: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        frameLayout {
            lparams(width = matchParent, height = wrapContent)
            padding = dip(5)


            listData = recyclerView {
                lparams(width = matchParent, height = wrapContent)
                layoutManager = GridLayoutManager(ctx, 1)

            }

        }

        adapter = DataDiriAdapter(result) {

        }

        listData.adapter = adapter
        presenter = MainPresenter(this, ApiRepository(), ApiRepositoryDD(), Gson())
        presenter.getDataDiri()

    }

    override fun showData(data: List<DataItem>) {
        result.clear()
        result.addAll(data)
        adapter.notifyDataSetChanged()
    }


}

