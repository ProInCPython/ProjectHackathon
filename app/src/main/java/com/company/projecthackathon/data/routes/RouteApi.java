package com.company.projecthackathon.data.routes;

import com.company.projecthackathon.domain.Route;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RouteApi {
    @GET("route/{id}")
    Call<List<Route>> getRoute(@Path("id") long id);;
}
