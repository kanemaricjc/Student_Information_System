/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationsystem;

/**
 *
 * @author Acer
 */
public class Student {
    
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    
    public Student(int studentId, String firstName, String lastName, int age, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    
    public int getStudentID() {
        return studentId;
    }
    
    public void setStudentId(int id) {
        this.studentId = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String name) {
        this.firstName = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String name) {
        this.lastName = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
}


