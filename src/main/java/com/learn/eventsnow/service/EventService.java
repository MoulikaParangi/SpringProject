package com.learn.eventsnow.service;

import com.learn.eventsnow.model.Event;
import com.learn.eventsnow.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.*;

@Service
public class EventService {

  List<Event> eventList=new ArrayList<Event>();
  @Autowired
  private EventRepository eventRepository;
public Event addEvent(Event event)
{

  return eventRepository.save(event);
}

public void deleteEvent(Integer eventID)
{
 eventRepository.deleteById(eventID);

}

public Event updateEvent(Integer eventID, Event event){
  Event updateEvent=eventRepository.findById(eventID).orElse(null);
  if(updateEvent!=null)
  {
    updateEvent.setEventName(event.getEventName());
    updateEvent.setEventDetails(event.getEventDetails());
    updateEvent.setEventDate(event.getEventDate());
    updateEvent.setEventTicketPrice(event.getEventTicketPrice());
    eventRepository.save(updateEvent);
    return updateEvent;

  }

  return null;

}



public List<Event> getEventList()
{

  return eventRepository.findAll();
}



public Event getSingleEvent(Integer eventID)
{
  Event getEvent=eventRepository.findById(eventID).orElse(null);
  if(getEvent!=null)
  {
    return getEvent;
  }

  return null;
}

}
