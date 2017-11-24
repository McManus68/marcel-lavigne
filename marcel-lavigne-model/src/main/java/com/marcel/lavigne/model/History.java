package com.marcel.lavigne.model;

import javax.persistence.*;

@Entity
@Table(name = "history")
public class History extends MarcelLavigneEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @Column(name = "ticket_booked_count")
    private Integer ticketBookedCount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Integer getTicketBookedCount() {
        return ticketBookedCount;
    }

    public void setTicketBookedCount(Integer ticketBookedCount) {
        this.ticketBookedCount = ticketBookedCount;
    }
}
