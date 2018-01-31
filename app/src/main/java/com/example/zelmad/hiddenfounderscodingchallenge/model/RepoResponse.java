package com.example.zelmad.hiddenfounderscodingchallenge.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zelmad on 22/01/2018.
 */

public class RepoResponse {

    @SerializedName("items")
    @Expose
    private List<Repository> repositories;

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }
}