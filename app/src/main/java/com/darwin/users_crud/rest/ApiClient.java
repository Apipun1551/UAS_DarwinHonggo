package com.darwin.users_crud.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String Base_URL = "https://reqres.in/api/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                                    .baseUrl(Base_URL)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return retrofit;
    }
}
