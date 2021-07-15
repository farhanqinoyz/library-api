package com.farhan.library.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "books", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    @Column(name = "book_id", unique = true, nullable = false)
    private Long bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "year_release")
    private Integer yearRelease;
}
