package com.farhan.library.repositories;

import com.farhan.library.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Books, Long> {
    @Query(value = "SELECT * FROM books \n" +
            "WHERE LOWER(books.title) LIKE LOWER(CONCAT('%',:keyword,'%')) " +
            "ORDER BY title ASC", nativeQuery = true)
    List<Books> getBooksByKeyword(@Param("keyword") String keyword);
}
