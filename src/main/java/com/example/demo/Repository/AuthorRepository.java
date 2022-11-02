package com.example.demo.Repository;

import com.example.demo.Entities.Author_Data;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author_Data,Integer> {
}
