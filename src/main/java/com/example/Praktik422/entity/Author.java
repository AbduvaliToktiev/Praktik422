package com.example.Praktik422.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Author.TABLE_NAME)
public class Author {
    public static final String TABLE_NAME = "AUTHORS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    String fullName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
    List<Book> books;
}
