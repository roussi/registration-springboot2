package com.aroussi.service.registration.repository;

import com.aroussi.service.registration.model.Reservation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {
}
