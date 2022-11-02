package com.example.demo.Entities;

import javax.persistence.*;

@Entity
public class Subject_Data {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String      name;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Author_Data author;
    public Author_Data getAuthor() {
        return author;
    }

    public void setAuthor(Author_Data author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
