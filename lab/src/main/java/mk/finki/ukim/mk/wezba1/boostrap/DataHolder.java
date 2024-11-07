package mk.finki.ukim.mk.wezba1.boostrap;


import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.wezba1.model.Category;
import mk.finki.ukim.mk.wezba1.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Event> eventList = new ArrayList<>(10);

    //da se napravi kategorija za sekoj event i da se napravi filter za listanje na kategorijata
//primer muzicka kategorija da ima kopce i koga ke se stisne da izlezat eventite na taa muzicka kategorija
    //category treba da bide klasa i taa klasa da ja ima vo event klasata
    @PostConstruct
    public void init(){
        eventList.add(new Event("Theater Play", "A night of drama and performances", 5,new Category("Musical")));
        eventList.add(new Event("Yoga Retreat", "A relaxing weekend retreat", 12,new Category("Musical")));
        eventList.add(new Event("Music Festival", "Three days of music and fun", 30,new Category("Musical")));
        eventList.add(new Event("Charity Gala", "A gala dinner for charity", 18,new Category("Musical")));
    }
}
