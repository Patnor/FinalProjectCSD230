package com.example.finalprojectcsd230;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DrinksApi {

    @GET("filter.php?a=Alcoholic")
    Call<List<Drink>> getDrinks();
}
