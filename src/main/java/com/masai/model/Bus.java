package com.masai.model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity

public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer busId;

    @Setter
    private String busName;

    @Setter
    private String driverName;

    @Setter
    private String busType;

    @Setter
    private String routeFrom;

    @Setter
    private String routeTo;

    @Setter
    private LocalTime arrivalTime;

    @Setter
    private LocalTime departureTime;

    @Setter
    private Integer seats;

    @Setter
    private Integer availableSeats;

    @Setter
    @ManyToOne
    @JsonIgnore
    private Route route;

    @Override
    public String toString() {
        return "Bus [busId=" + busId + ", busName=" + busName + ", driverName=" + driverName + ", busType=" + busType
                + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", arrivalTime=" + arrivalTime
                + ", departureTime=" + departureTime + ", seats=" + seats + ", availableSeats=" + availableSeats+"]";
    }





}