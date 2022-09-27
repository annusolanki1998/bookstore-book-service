package com.bridgelabz.bookstorebookservice.model;

import com.bridgelabz.bookstorebookservice.dto.BookDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Book")
@Data
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "author")
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "logo")
    private String logo;
    @Column(name = "price")
    private int price;
    @Column(name = "quantity")
    private int quantity;

    public BookModel(BookDto bookDto) {
        this.bookName = bookDto.getBookName();
        this.author = bookDto.getAuthor();
        this.description = bookDto.getDescription();
        this.logo = bookDto.getLogo();
        this.price = bookDto.getPrice();
        this.quantity = bookDto.getQuantity();
    }


    public BookModel() {

    }
}
