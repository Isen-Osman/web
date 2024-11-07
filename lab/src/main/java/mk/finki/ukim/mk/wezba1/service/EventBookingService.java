package mk.finki.ukim.mk.wezba1.service;

import mk.finki.ukim.mk.wezba1.model.EventBooking;

public interface EventBookingService {
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);


}
