package com.sardina;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EventLog extends Event{

    public EventLog(List<Event> eventList) {
        this.eventList = eventList;
    }

    //ADD METHODS AND VARIABLES
    private List<Event> eventList = new ArrayList<>();

    public boolean addEvent (Event event) throws IllegalArgumentException {
            if (event == null  || event.action == null || event.name == null) {
                System.out.println("IllegalArgumentException Thrown! Event, action, or name are null or missing.");
                throw new IllegalArgumentException();
            }
                System.out.println("Event Name: " + event.name + ", Event Action: " + event.action + ".");
                eventList.add(event);
                return true;
    }

    public int getNumEvents() {
        return eventList.size();
    }

    public EventLog(){} //initializes the list

}
