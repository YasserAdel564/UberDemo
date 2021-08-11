package com.uberDemo.app.data.api

import com.uberDemo.app.data.model.VehicleModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("marketplace")
    suspend fun getData(
        @Query("lat") lat: Double?,
        @Query("lng") lng: Double?,
    ): List<VehicleModel>
}