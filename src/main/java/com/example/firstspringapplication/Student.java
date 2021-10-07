package com.example.firstspringapplication;

public class Student {
    private String name;
    private int rollNo;
    private boolean isActive;

    public Student(String name, int rollNo, boolean isActive) {
        this.name = name;
        this.rollNo = rollNo;
        this.isActive = isActive;
    }

    public String display() {
        return "Name: " + name + "\nRollNo: " + rollNo + "\nIsActive: " + isActive;
    }

}
