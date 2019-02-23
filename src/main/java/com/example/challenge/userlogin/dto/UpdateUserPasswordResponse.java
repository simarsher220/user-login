package com.example.challenge.userlogin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserPasswordResponse {

    private String status;

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
