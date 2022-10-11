package com.udacity.project4.locationreminders.data.dto

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val message: String?, val statusCode: Int? = null) :
        Result<Nothing>()
}
val Result<*>.succeeded
    get() = this is Result.Success && data != null