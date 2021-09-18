package com.example.cryptocurrencycleanmvvm.data.remote

import retrofit2.http.GET


interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId:String): CoinDetailDto

}