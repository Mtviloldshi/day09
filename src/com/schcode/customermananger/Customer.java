package com.schcode.customermananger;

import javax.print.DocFlavor;

public class Customer {


    //私有化
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;
    public Customer(){

    }
    public Customer(String name , char gender, int age, String phone,String emial){
        this.name = name;
        this.age = age;
        this.gender= gender;
        this.phone = phone;
        this .email = emial;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public static void main(String[] args) {

    }
}
