package com.example.springprojectexample.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import java.awt.print.Book;


@Entity
@Getter
@Setter
public class Spring {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "spring", cascade = CascadeType.ALL, optional = true, orphanRemoval = false)
    @JoinColumn(nullable = true, insertable = true,unique = false)
    private Spring spring;


}
