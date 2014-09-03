package org.pmt.web;

/**
 * Model
 */
public class Customer {

    public int id;
    public String firstname;
    public String lastname;
    public int age;

    public void setId(int id) {
        this.id = id;
    }

    public int getId () {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer Id: " + id + ", Firstname: " + firstname + ", Lastname: " + lastname + ", Age: " + age;
    }




}
