package com.quantum.flightcheckin.integration;

import com.quantum.flightcheckin.integration.dto.Reservation;
import com.quantum.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);
}
