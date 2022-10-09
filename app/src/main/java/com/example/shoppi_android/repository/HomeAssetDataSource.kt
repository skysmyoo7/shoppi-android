package com.example.shoppi_android.repository

import com.example.shoppi_android.AssetLoader
import com.example.shoppi_android.model.HomeData
import com.google.gson.Gson

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    override fun getHomeData(): HomeData? {
       return assetLoader.getJsonString("home.json")?.let {homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }


    }
}