package com.pan.myfriendsapp.api.user.dto;

public class PostUserRequestBody {

    private final String name;
    private final String email;
    private final String bio;

    public PostUserRequestBody(String name, String email, String bio) {
        this.name = name;
        this.email = email;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return bio;
    }
}
