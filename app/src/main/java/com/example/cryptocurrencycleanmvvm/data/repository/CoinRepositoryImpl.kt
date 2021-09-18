package com.example.cryptocurrencycleanmvvm.data.repository

import com.example.cryptocurrencycleanmvvm.data.remote.CoinDetailDto
import com.example.cryptocurrencycleanmvvm.data.remote.CoinDto
import com.example.cryptocurrencycleanmvvm.data.remote.CoinPaprikaApi
import com.example.cryptocurrencycleanmvvm.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(val api: CoinPaprikaApi):CoinRepository{

    override suspend fun getCoin(): List<CoinDto> {
           return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
       return api.getCoinById(coinId)
    }
}
