package mk.finki.ukim.mk.wezba1.service.impl;

import mk.finki.ukim.mk.wezba1.model.Event;
import mk.finki.ukim.mk.wezba1.model.exception.EventTextExceptions;
import mk.finki.ukim.mk.wezba1.repository.InMemoryEventRepository;
import mk.finki.ukim.mk.wezba1.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final InMemoryEventRepository inMemoryEventRepository;

    public EventServiceImpl(InMemoryEventRepository inMemoryEventRepository) {
        this.inMemoryEventRepository = inMemoryEventRepository;
    }

    @Override
    public List<Event> listAll() {
        return inMemoryEventRepository.findAll();
    }

    @Override
    public List<Event> searchEvents(String text, long number) {
        if ((text == null) || text.isEmpty()) {
            throw new EventTextExceptions("Tekstot ne moze da bide prazen");
        } else if (number <= 0 ) {
            throw new EventTextExceptions("Poleto treba da bide pogolemo od 0");
        }

        return inMemoryEventRepository.searchEvent(text, number);
   }

    @Override
    public List<Event> searchCategory(String category) {
        return inMemoryEventRepository.listByCategory(category);
    }

}
