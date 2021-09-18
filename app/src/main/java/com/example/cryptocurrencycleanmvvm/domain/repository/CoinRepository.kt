package com.example.cryptocurrencycleanmvvm.domain.repository

import com.example.cryptocurrencycleanmvvm.data.remote.CoinDetailDto
import com.example.cryptocurrencycleanmvvm.data.remote.CoinDto

interface CoinRepository {
    suspend fun getCoin():List<CoinDto>
    suspend fun getCoinById(coinId:String): CoinDetailDto
}