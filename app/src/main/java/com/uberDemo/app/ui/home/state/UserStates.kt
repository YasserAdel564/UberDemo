package com.uberDemo.app.ui.home.state

import com.uberDemo.app.data.model.VehicleModel

sealed class UserStates {
    object Idle : UserStates()
    object Loading : UserStates()
    object NoConnection : UserStates()
    data class Success(val user: List<VehicleModel>) : UserStates()
    data class Error(val error: String?) : UserStates()
    object Empty : UserStates()

}