package com.tds.dto;

public class DtoUser {
    private Long id;
    private String firstName;
    private String lastName;

    public long getId() {
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

    public DtoUser(Long id, String firstName, String lastName) {
        this.id = id;
        this.setFirstName(firstName);
        this.lastName = lastName;
    }

}
