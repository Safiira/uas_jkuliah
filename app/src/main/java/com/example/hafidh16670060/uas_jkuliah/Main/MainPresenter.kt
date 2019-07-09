package com.example.hafidh16670060.uas_jkuliah.Main

import com.example.hafidh16670060.uas_jkuliah.Model.Response
import com.example.hafidh16670060.uas_jkuliah.rest_api.ApiRepository
import com.example.hafidh16670060.uas_jkuliah.rest_api.ApiRepositoryDD
import com.example.hafidh16670060.uas_jkuliah.rest_api.DataAPI
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView,private val apiRepository:ApiRepository, private val apiRepositoryDD: ApiRepositoryDD,private val gson: Gson){
    fun getJadwalList(){
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(DataAPI.getDataJadwal()),
            Response::class.java)
            uiThread {
                view.showData(data.data)
            }
        }
    }

    fun getDataDiri(){
        doAsync {
            val data = gson.fromJson(apiRepositoryDD.doRequest(DataAPI.getDataDiri()),
                Response::class.java)
            uiThread {
                view.showData(data.data)
            }
        }
    }
}