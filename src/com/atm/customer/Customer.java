package com.atm.customer;

public class Customer implements ICustomer {
    String firstName;
    String middleName;
    String lastName;

    public Customer(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return getFirstName() + (!getMiddleName().isEmpty() ? getMiddleName() : "") + " " + getLastName();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "First Name: '" + firstName + '\'' +
                ", Middle Name: '" + middleName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                '}';
    }
}