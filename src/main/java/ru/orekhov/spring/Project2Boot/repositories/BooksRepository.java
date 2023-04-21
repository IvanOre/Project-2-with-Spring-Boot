package ru.orekhov.spring.Project2Boot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.orekhov.spring.Project2Boot.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book,Integer> {
    List<Book> findByTitleStartingWith(String title);
}
