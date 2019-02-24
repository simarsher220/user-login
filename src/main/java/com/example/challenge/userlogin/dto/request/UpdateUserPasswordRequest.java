package com.example.challenge.userlogin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserPasswordRequest {

    private String oldPassword;
    private String newPassword;

    @JsonProperty("old_password")
    public String getOldPassword() {
        return oldPassword;
    }

    @JsonProperty("new_password")
    public String getNewPassword() {
        return newPassword;
    }
}
