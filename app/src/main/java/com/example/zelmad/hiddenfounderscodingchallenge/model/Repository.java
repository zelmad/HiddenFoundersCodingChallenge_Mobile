package com.example.zelmad.hiddenfounderscodingchallenge.model;

/**
 * Created by zelmad on 31/01/2018.
 */

import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Repository {
    @SerializedName("name")
    @Expose
    private String repoName;

    @SerializedName("description")
    @Expose
    private String repoDesc;

    @SerializedName("owner")
    @Expose
    private Owner repoOwner;

    @SerializedName("stargazers_count")
    @Expose
    private String nbOfStars;

    public Repository(String repoName, String repoDesc, String avatar, Owner repoOwner, String nbOfStars) {
        this.repoName = repoName;
        this.repoDesc = repoDesc;
        this.repoOwner = repoOwner;
        this.nbOfStars = nbOfStars;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoDesc() {
        return repoDesc;
    }

    public void setRepoDesc(String repoDesc) {
        this.repoDesc = repoDesc;
    }


    public Owner getRepoOwner() {
        return repoOwner;
    }

    public void setRepoOwner(Owner repoOwner) {
        this.repoOwner = repoOwner;
    }

    public String getNbOfStars() {
        return nbOfStars;
    }

    public void setNbOfStars(String nbOfStars) {
        this.nbOfStars = nbOfStars;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "repoName='" + repoName + '\'' +
                ", repoDesc='" + repoDesc + '\'' +
                ", repoOwn='" + repoOwner + '\'' +
                ", nbOfStars='" + nbOfStars + '\'' +
                '}';
    }
}
