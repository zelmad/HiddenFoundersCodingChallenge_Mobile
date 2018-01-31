package com.example.zelmad.hiddenfounderscodingchallenge.Backend;

import retrofit2.Call;
import retrofit2.http.GET;
import zelmad.mohamed.gitstarred.model.RepoResponse;

/**
 * Created by zelmad on 20/01/2018.
 */

public class ServerInterface {
    @GET("/search/repositories?q=created:>2017-10-22&sort=stars&order=desc")
    Call<RepoResponse> getRepositories();
}
