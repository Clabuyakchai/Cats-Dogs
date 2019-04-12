package com.clabuyakchai.myapplication.data.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Animal> data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Animal> getData() {
        return data;
    }

    public void setData(List<Animal> data) {
        this.data = data;
    }
}
