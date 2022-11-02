package com.example.demo.Entities;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Book_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String           bookName;
    @ManyToMany(mappedBy = "bookSet")
    private Set<Author_Data> authors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Set<Author_Data> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author_Data> authors) {
        this.authors = authors;
    }
}
