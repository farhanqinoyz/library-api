package com.farhan.library.repositories;

import com.farhan.library.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {

}
