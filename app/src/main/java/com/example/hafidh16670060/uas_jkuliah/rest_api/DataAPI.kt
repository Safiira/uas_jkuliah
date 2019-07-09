package com.example.hafidh16670060.uas_jkuliah.rest_api

import com.example.hafidh16670060.uas_jkuliah.BuildConfig.*
import java.net.URL

object DataAPI {
    fun getDataJadwal() :String{

        return BASE_URL + API_KEY + NPM
    }
    fun getDataDiri() :String{

        return BASE_URL_DATA + API_KEY + NPM
    }
}
