package com.example.studentcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String adress;
    private String gender;
    private String qualification;
    public Long getId( ) {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
     public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
     public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

}
