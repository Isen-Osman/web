package mk.finki.ukim.mk.wezba1.service.impl;

import mk.finki.ukim.mk.wezba1.model.EventBooking;
import mk.finki.ukim.mk.wezba1.service.EventBookingService;
import org.springframework.stereotype.Service;

@Service
public class EventBookingServiceImpl implements EventBookingService {

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        if (eventName == null || eventName.isEmpty()) {
            return null;
        }

        return new EventBooking(eventName,attendeeName,attendeeAddress, (long) numberOfTickets);

    }
}
