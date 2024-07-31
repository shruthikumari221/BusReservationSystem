package com.masai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userLoginId;

    @Column(unique = true)
    private String userName;

    @Size(max = 10, message = "Password length must be between 6 to 10 character", min = 0)
    private String password;

    private String firstName;

    private String lastName;
    @NotBlank
    private String contact;

    @Email(value = "[a-z0-9._]+@[a-z0-9._]+\\.[a-z]{2,3}",message = "Email must be in a valid format")
    private String email;

    @JsonIgnore
    @OneToOne
    private Reservation reservation;



    }