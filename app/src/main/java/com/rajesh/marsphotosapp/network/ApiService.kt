package com.rajesh.marsphotosapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


   private  val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()



interface ApiService{

    @GET("photos")
    fun getPhotos() : String

}

object MarsApi{

    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}




