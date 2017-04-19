
package com.bzhong.yanport;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dealer implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("email")
    @Expose
    private String email;
    private final static long serialVersionUID = 1383429896676422554L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dealer() {
    }

    /**
     * 
     * @param id
     * @param phoneNumber
     * @param email
     * @param name
     * @param type
     */
    public Dealer(long id, String name, String type, String phoneNumber, String email) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
