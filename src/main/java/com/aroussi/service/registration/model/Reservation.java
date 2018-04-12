package com.aroussi.service.registration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    String reservationID;
    LocalDateTime reservationDate;
    String name;

    public Reservation(String reservationID, LocalDateTime reservationDate, String name) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.name = name;
    }
}
