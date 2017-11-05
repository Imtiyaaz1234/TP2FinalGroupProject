package com.TPFinalGroupAssign.TheatreSystem.Repositories;

import TheatreSystem.Domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
