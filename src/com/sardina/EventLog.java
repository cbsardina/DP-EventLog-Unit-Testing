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
            if (((event.action.equals("Face2Face"))) || ((event.action.equals("PhoneCall"))) ||
                    ((event.action.equals("TextMessaging"))) || ((event.action.equals("Unknown")))) {
                System.out.println("Event Name: " + event.name + ", Event Action: " + event.action + ".");
                eventList.add(event);
                return true;
            }
                System.out.println("Error: Action options are: \'Face2Face\', \'PhoneCall\', \'TextMessaging\', or \'Unknown\'." );
                throw new IllegalArgumentException();
    }

    public int getNumEvents() {
        return eventList.size();
    }

    public EventLog(){} //initializes the list

    @Override
    public String toString() {
        return "EventLog{" +
                "eventList=" + eventList +
                ", name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
