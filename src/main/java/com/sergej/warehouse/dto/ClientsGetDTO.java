package com.sergej.warehouse.dto;

import com.sergej.warehouse.enums.ClientType;

import java.util.Date;

public class ClientsGetDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Integer phoneNumber;
    private ClientType clientType;


    public ClientsGetDTO(Long id, String firstName, String lastName, Date dateOfBirth,
                         Integer phoneNumber, ClientType clientType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.clientType = clientType;
    }

    public ClientsGetDTO() {
    }

    public Long getId() {
        return id;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
}
