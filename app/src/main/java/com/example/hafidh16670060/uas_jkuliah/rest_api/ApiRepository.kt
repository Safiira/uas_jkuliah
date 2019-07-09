package com.example.hafidh16670060.uas_jkuliah.rest_api

import java.net.URL


class ApiRepository {
    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}
class ApiRepositoryDD {
    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}