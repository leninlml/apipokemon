package com.example.pokemonapi.utils.retrofit;

import retrofit2.Retrofit;

public class RetrofitClient {

    private final ApiServices services;
    private static RetrofitClient client;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/")
                .build();

        services = retrofit.create(ApiServices.class);
    }

    public static RetrofitClient getInstance() {
       if(client == null) {
           client = new RetrofitClient();
       }

       return client;
    }

    public ApiServices getService() {
        return services;
    }
}
