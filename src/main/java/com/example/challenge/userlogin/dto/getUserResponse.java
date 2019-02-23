package com.example.challenge.userlogin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "data")
public class getUserResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String username;

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }
}
