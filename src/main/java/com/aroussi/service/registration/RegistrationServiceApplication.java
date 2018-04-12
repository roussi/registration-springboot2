package com.aroussi.service.registration;

import com.aroussi.service.registration.model.Reservation;
import com.aroussi.service.registration.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
public class RegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ReservationRepository reservationRepository){
		return args -> {
			Flux.just(
					new Reservation(UUID.randomUUID().toString(), LocalDateTime.now(), "Reservation 1"),
					new Reservation(UUID.randomUUID().toString(), LocalDateTime.now(), "Reservation 2"),
					new Reservation(UUID.randomUUID().toString(), LocalDateTime.now(), "Reservation 3"),
					new Reservation(UUID.randomUUID().toString(), LocalDateTime.now(), "Reservation 4"),
					new Reservation(UUID.randomUUID().toString(), LocalDateTime.now(), "Reservation 5")
			).flatMap(reservationRepository::save)
					.subscribe(System.out::println);
		};
	}
}
