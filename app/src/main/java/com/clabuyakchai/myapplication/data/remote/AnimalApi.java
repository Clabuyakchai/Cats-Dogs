package com.clabuyakchai.myapplication.data.remote;

import com.clabuyakchai.myapplication.data.remote.dto.Response;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AnimalApi {
    @GET("/api.php")
    Single<Response> getAnimalFromApi(@Query("query")String animal);
}
