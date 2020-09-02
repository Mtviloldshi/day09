package com.sch.customer1;


public class Cusomer {
    private String name;
    private  char gender;
    private  int age;
    private String phone;
    private String email;
    public Cusomer(String name,char gender,int age,String phone,String email ){
        this.name =name;
        this.gender =gender;
        this.age = age;
        this.phone = phone;
        this.email= email;
    }
    public String getName(){return name;}
    public char gender(){return gender;}
    public int geTage(){return  age;}
    public String getPhone(){return  phone;}
    public String getEmail(){return email;}
    public void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void  setAge(int age){
        this.age =age;
    }
    public  void  setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email= email;
    }

    public static void main(String[] args) {

    }
}
