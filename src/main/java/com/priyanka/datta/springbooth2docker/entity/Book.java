package com.priyanka.datta.springbooth2docker.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "AUTHOR_NAME")
    private String authorName;

    @Column(name = "RATING")
    private Double rating;
}
