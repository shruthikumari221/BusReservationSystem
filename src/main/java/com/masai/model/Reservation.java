package com.masai.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
//import com.masai.exception.CustomDateDeserializer;

@Getter
@Entity
public class Reservation {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reservationId;

    @Setter
    private String reservationStatus;

    @Setter
    private String reservationType;

    @Setter
    @Future(message = "Date should not be in past *")
//	@NotNull(message = "Reservation Date is mandatory *")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
    private LocalDate reservationDate;


    //	@NotNull(message = "Reservation Time is mandatory *")
//	@JsonFormat(pattern = "hh-mm-ss", shape = Shape.STRING)
    private LocalTime reservationTime;

    //	@NotNull(message = "Reservation source is mandatory *")
    @Setter
    private String source;

    //	@NotBlank(message = "Reservation destination not be ramain empty *")
//	@NotNull(message = "Reservation destination is mandatory *")
    @Setter
    private String destination;



    @Setter
    @OneToOne
    private Bus bus;





    public Reservation(Integer reservationId,
                       @Future(message = "Date should not be in past *") LocalDate reservationDate, String source,
                       String destination) {
        super();
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.source = source;
        this.destination = destination;
    }


    public Reservation() {

    }


    public void setReservationTime(String reservationTime) {
        this.reservationTime = LocalTime.parse(reservationTime);
    }


    @Override
    public String toString() {
        return "Reservation [reservationId=" + reservationId + ", reservationStatus=" + reservationStatus
                + ", reservationType=" + reservationType + ", reservationDate=" + reservationDate + ", reservationTime="
                + reservationTime + ", source=" + source + ", destination=" + destination + "]";
    }

}