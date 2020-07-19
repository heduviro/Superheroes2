package com.example.superheroes2

import io.reactivex.Observable
import retrofit2.http.GET

interface GetData {

    @GET("10156112965520834")
    fun getData() : Observable<List<SuperHeroes>>

}