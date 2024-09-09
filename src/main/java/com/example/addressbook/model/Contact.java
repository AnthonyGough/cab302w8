package com.example.addressbook.model;

/**
 * Class to create Contact Objects that have firstname, lastname, phone and email attributes
 */
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * Constructor for Contact Objects
     * @param firstName - firstname of user
     * @param lastName - lastname of user
     * @param email - email address
     * @param phone  - phone number
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}