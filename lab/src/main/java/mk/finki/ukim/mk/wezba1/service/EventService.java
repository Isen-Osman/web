package mk.finki.ukim.mk.wezba1.service;

import mk.finki.ukim.mk.wezba1.model.Event;

import java.util.List;

public interface EventService {
    List<Event> listAll();

    List<Event> searchEvents(String text , long number);
    List<Event> searchCategory(String category);
}
