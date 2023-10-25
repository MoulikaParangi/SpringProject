package com.learn.eventsnow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer eventID;
    @Column
    private String eventName;
    @Column
    private String eventDetails;
    @Column
    private Date eventDate;
    @Column
    private Integer eventTicketPrice;

}
