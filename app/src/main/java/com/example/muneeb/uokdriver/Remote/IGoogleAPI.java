package com.example.muneeb.uokdriver.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by munee on 12/16/2017.
 */
public interface IGoogleAPI
{
    @GET
    Call<String> getPath(@Url String url);

}
