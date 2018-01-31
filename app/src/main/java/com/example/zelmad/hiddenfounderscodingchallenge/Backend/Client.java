package com.example.zelmad.hiddenfounderscodingchallenge.Backend;

/**
 * Created by zelmad on 20/01/2018.
 */

public class Client {
    public static final String BASE_URL = "https://api.github.com";
    //use retrofit to manage http calls
    public static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
