package com.example.zelmad.hiddenfounderscodingchallenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by zelmad on 21/01/2018.
 */

public class Owner {

    @SerializedName("avatar_url")
    @Expose
    private String avatar;

    @SerializedName("login")
    @Expose
    private String name;

    public Owner(String avatar, String name) {
        this.avatar = avatar;
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}