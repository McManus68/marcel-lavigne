package com.marcel.lavigne.model;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "user_settings")
public class UserSettings extends MarcelLavigneEntity {

    private Locale locale;

    @Column(name = "notify_new_message")
    private Boolean notifyNewMessage;

    @Column(name = "notify_new_event")
    private Boolean notifyNewEvent;

    @Column(name = "notify_subscription_approved")
    private Boolean notifySubscriptionApproved;

    @Column(name = "notify_subscription_rejected")
    private Boolean notifySubscriptionRejected;

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
