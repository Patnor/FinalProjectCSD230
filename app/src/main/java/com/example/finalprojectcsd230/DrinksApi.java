package com.example.finalprojectcsd230;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DrinksApi {

    @GET("filter.php?a=Alcoholic")
    Call<JsonObject> getJsonDrinks();
    @GET("filter.php?a=Alcoholic")
    Call<List<Drink>> getDrinks();

    @GET("filter.php?a=Alcoholic")
    Call<DrinkObj> getDrinkObj();


    @GET("filter.php?a=Alcoholic")
    Call<DrinkList> getDrinkList();
}
