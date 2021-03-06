package com.tiy.practice;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by crci1 on 1/27/2017.
 */

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    Integer event_id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    java.sql.Timestamp time;

    public Event() {

    }

    public Event(Integer id, String name, String location, String address, java.sql.Timestamp time) {
        this.event_id = id;
        this.name = name;
        this.location = location;
        this.address = address;
        this.time = time;
    }


    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
