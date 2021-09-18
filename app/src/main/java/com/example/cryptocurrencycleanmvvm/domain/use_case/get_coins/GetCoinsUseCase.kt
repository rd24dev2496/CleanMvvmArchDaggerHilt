package com.example.cryptocurrencycleanmvvm.domain.use_case.get_coins

import com.example.cryptocurrencycleanmvvm.common.Resource
import com.example.cryptocurrencycleanmvvm.data.remote.toCoin
import com.example.cryptocurrencycleanmvvm.data.remote.toCoinDetail
import com.example.cryptocurrencycleanmvvm.domain.model.Coin
import com.example.cryptocurrencycleanmvvm.domain.model.CoinDetail
import com.example.cryptocurrencycleanmvvm.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(private  val repository: CoinRepository){
    operator fun invoke(coinId:String): kotlinx.coroutines.flow.Flow<Resource<CoinDetail>>  = flow {
        try{
           emit(Resource.Loading())
            val coin=repository.getCoinById(coinId).toCoinDetail()
        emit(Resource.Success(coin))
        }
        catch (e:HttpException){

        }catch (e:IOException){

        }
    }
}