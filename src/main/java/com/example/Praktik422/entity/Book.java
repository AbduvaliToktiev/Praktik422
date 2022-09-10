package com.example.Praktik422.entity;

import com.example.Praktik422.enums.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Data
@Table(name = Book.TABLE_NAME)

public class Book {

    public static final String TABLE_NAME = "BOOKS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;

    private String author;
}
