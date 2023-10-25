package com.learn.eventsnow.controller;

import com.learn.eventsnow.model.Event;
import com.learn.eventsnow.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/all")
public List<Event> getEventList()
    {

        return eventService.getEventList();
    }
    @GetMapping("/single/{eventID}")
    public Event getSingleEvent(@PathVariable Integer eventID)
    {
        return eventService.getSingleEvent(eventID);
    }

    @PostMapping("/add")
    public Event addEvent(@RequestBody Event event){

        return eventService.addEvent(event);
    }

    @PutMapping("/update/{eventID}")
    public Event updateEmployee(@PathVariable Integer eventID,@RequestBody Event event)
    {
        return eventService.updateEvent(eventID,event);
    }

    @DeleteMapping("/delete/{eventID}")
    public void deleteEmployee(@PathVariable Integer eventID)
    {
        System.out.println("Deleted successfully");
        eventService.deleteEvent(eventID);

    }

}
