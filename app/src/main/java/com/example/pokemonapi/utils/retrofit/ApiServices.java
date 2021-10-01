package com.example.pokemonapi.utils.retrofit;

import androidx.annotation.CallSuper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServices {

    @GET("v2/pokemon")
    Call<String> getPokemonList(@Query("limit") int limit);

    @GET("v2/pokemon-form/{id}/")
    Call<String> getPokemon(@Path("id") int id);
}
