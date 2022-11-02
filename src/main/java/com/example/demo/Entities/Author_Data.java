package com.example.demo.Entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Author_Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int               id;
    private String            firstName;
    private String            lastName;
    @OneToMany(mappedBy = "author", cascade = CascadeType.PERSIST)
    @Size(min = 3)
    private Set<Subject_Data> subjects;

    public Set<Subject_Data> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject_Data> subjects) {
        this.subjects = subjects;
    }


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_books",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    private Set<Book_Data> bookSet;
    @Embedded
    private Address_Data   address;


    public Set<Book_Data> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book_Data> bookSet) {
        this.bookSet = bookSet;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address_Data getAddress() {
        return address;
    }

    public void setAddress(Address_Data address) {
        this.address = address;
    }
}
