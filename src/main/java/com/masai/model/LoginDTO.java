package com.masai.model;

import lombok.Data;

@Data
public class LoginDTO {
    @NotNull(message = "", value = "Username cannot be null.")
    private String username;
    @NotNull(message = "", value = "Password cannot be null.")
    private String password;
}