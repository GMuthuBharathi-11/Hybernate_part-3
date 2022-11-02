package com.example.demo;
 import com.example.demo.Entities.Address_Data;
 import com.example.demo.Entities.Author_Data;
 import com.example.demo.Entities.Book_Data;
 import com.example.demo.Entities.Subject_Data;
 import com.example.demo.Repository.AuthorRepository;
 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;

 import java.util.HashSet;

@SpringBootTest
public class AuthorTesting {
    @Autowired
    AuthorRepository repository;



    @Test
    public void testCreateAuthor()
    {
        Author_Data author =new Author_Data();

        author.setFirstName("tom");
        author.setLastName("Jerry");

        HashSet<Book_Data> books =new HashSet<>();
        Book_Data book1 =new Book_Data();

        book1.setBookName("Autograph");
        books.add(book1);

        author.setBookSet(books);

        Address_Data address =new Address_Data();
        address.setStreetNumber(501);
        address.setLocation("jayanagar");
        address.setState("bangalore");
        author.setAddress(address);
        repository.save(author);

    }
    @Test
    public void testPersist()
    {

        Author_Data author =new Author_Data();
        author.setFirstName("bjarne");
        author.setLastName("stroustrup");
        Subject_Data subject =new Subject_Data();
        subject.setAuthor(author);
        subject.setName("fabrick");
        Subject_Data subject1 =new Subject_Data();
        subject1.setAuthor(author);
        subject1.setName("Maths");
        Subject_Data subject2 =new Subject_Data();
        subject2.setAuthor(author);
        subject2.setName("german");
        HashSet<Subject_Data> subjects =new HashSet<>();
        subjects.add(subject);
        subjects.add(subject1);
        subjects.add(subject2);
        author.setSubjects(subjects);
        Address_Data address =new Address_Data();
        address.setStreetNumber(501);
        address.setLocation("jayanagar");
        address.setState("Bangalore");
        author.setAddress(address);
        repository.save(author);
    }
}
