
package com.bzhong.yanport;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event implements Serializable
{

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("eventType")
    @Expose
    private String eventType;
    @SerializedName("value")
    @Expose
    private double value;
    private final static long serialVersionUID = 7031054844037688083L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param value
     * @param eventType
     * @param date
     */
    public Event(String date, String eventType, double value) {
        super();
        this.date = date;
        this.eventType = eventType;
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
