package mk.finki.ukim.mk.wezba1.repository;

import mk.finki.ukim.mk.wezba1.boostrap.DataHolder;
import mk.finki.ukim.mk.wezba1.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryEventRepository {

    public List<Event> findAll(){
        return DataHolder.eventList;
    }

    public List<Event> searchEvent(String text,long number){
        return  DataHolder.eventList.stream().filter(event -> event.getName().equals(text) && event.getPopularityScore() <= number).toList();
    }

    public List<Event> listByCategory (String category) {
        return DataHolder.eventList.stream().filter(r->r.getCategory().getName().equals(category)).toList();
    }

}
