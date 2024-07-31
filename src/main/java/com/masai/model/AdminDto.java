package com.masai.model;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdminDto {
    @NotNull(message = "Username cannot be null.", value = "")
    private String username;
    @NotNull(message = "Password cannot be null.", value = "")
    private String password;
}