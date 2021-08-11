package com.uberDemo.app.data.repos

import com.uberDemo.app.data.api.ApiService
import javax.inject.Inject


class VehiclesRepo @Inject
constructor(
    private val apiService: ApiService,
) {
    suspend fun getData(lat: Double?, lng: Double?) = apiService.getData(lat, lng)
}