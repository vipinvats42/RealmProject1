package com.example.tapesh.realmproject1;


import io.realm.RealmObject;

/**
 * Created by TAPESH on 5/2/2016.
 */
public class Contect  extends RealmObject{
    private String name;
    private String email;
    private String address;
    private int age;


    public Contect(String name, String email, String address, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public Contect()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
