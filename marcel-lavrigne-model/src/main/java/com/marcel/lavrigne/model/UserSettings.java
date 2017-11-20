package com.marcel.lavrigne.model;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "user_settings")
public class UserSettings extends MarcelLavrigneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    private Locale locale;

    @Column(name = "notify_new_message")
    private Boolean notifyNewMessage;

    @Column(name = "notify_new_event")
    private Boolean notifyNewEvent;

    @Column(name = "notify_subscription_approved")
    private Boolean notifySubscriptionApproved;

    @Column(name = "notify_subscription_rejected")
    private Boolean notifySubscriptionRejected;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Boolean getNotifyNewMessage() {
        return notifyNewMessage;
    }

    public void setNotifyNewMessage(Boolean notifyNewMessage) {
        this.notifyNewMessage = notifyNewMessage;
    }

    public Boolean getNotifyNewEvent() {
        return notifyNewEvent;
    }

    public void setNotifyNewEvent(Boolean notifyNewEvent) {
        this.notifyNewEvent = notifyNewEvent;
    }

    public Boolean getNotifySubscriptionApproved() {
        return notifySubscriptionApproved;
    }

    public void setNotifySubscriptionApproved(Boolean notifySubscriptionApproved) {
        this.notifySubscriptionApproved = notifySubscriptionApproved;
    }

    public Boolean getNotifySubscriptionRejected() {
        return notifySubscriptionRejected;
    }

    public void setNotifySubscriptionRejected(Boolean notifySubscriptionRejected) {
        this.notifySubscriptionRejected = notifySubscriptionRejected;
    }
}
