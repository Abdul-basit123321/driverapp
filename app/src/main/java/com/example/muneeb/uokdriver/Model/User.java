package com.example.muneeb.uokdriver.Model;

/**
 * Created by munee on 12/10/2017.
 */
public class User {

    private String email, password, name, phone;

    public User() {

    }
    public User(String email, String password, String name, String phone)
    {
        this.email=email;
        this.password=password;
        this.name=name;
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
