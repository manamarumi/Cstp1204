package student;

import java.util.UUID;

public class student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    ;

    public student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = UUID.randomUUID().toString();;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void studentInfo() {
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Age: " + this.getAge());
        System.out.println("Student Address: " + this.getAddress());
        System.out.println("Student ID: " + this.getStudentID());
    }
}