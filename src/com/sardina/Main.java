package com.sardina;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

    Event oneOclockMeeting = new Event();
        oneOclockMeeting.setAction("Face2Face");
        oneOclockMeeting.setName("1pm meeting");

    EventLog eventLog = new EventLog();
        try {
            eventLog.addEvent(oneOclockMeeting);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace(); }


    }


}
