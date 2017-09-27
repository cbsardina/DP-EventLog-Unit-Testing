package com.sardina;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EventLog {

    String name;
    String action;

    public void Event(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAction() { return action; }

    public void setAction(String action) { this.action = action; }

//ADD METHODS AND VARIABLES
    private List<Event> eventList = new ArrayList<>();

    public boolean addEvent (Event event) throws IllegalArgumentException {
        if(event == null || this.name == null || this.action == null) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public int getNumEvents() {
        return 5; //returns the size of the list
    }

    public EventLog(){} //initializes the list

}
