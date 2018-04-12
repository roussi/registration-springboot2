package com.aroussi.service.registration.controller;

import com.aroussi.service.registration.model.Reservation;
import com.aroussi.service.registration.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class RegistrationController {

    private final ReservationRepository reservationRepository;

    public RegistrationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/hello")
    public Mono<String> sayHello(){
        return Mono.just("Hello every one");
    }

    @GetMapping("/reservations")
    public Flux<Reservation> allReservations(){
        return reservationRepository.findAll();
    }
}
