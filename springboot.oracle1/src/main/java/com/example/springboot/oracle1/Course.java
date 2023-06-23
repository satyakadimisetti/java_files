package com.example.springboot.oracle1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int id;
    private String coursename;
    private String author;
     private String address;
    public Course() {
    }

    public Course(int id, String coursename, String author,String address) {
        this.id = id;
        this.coursename = coursename;
        this.author = author;
        this.address=address;
    }

    public int getId() {
        return id;
    }


    public String getCoursename() {
        return coursename;
    }


    public String getAuthor() {
        return author;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
