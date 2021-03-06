package com.logicify.d2g.dtos.outgoingdtos;

import com.logicify.d2g.dtos.DtosDomains.OutgoingDto;

import java.util.UUID;

/**
 * Created by jadencorr on 23.02.17.
 */
public class UserOutgoingDto implements OutgoingDto {

    protected UUID id;

    protected String firstName;

    protected String lastName;

    protected String email;

    protected String avatarUrl;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
