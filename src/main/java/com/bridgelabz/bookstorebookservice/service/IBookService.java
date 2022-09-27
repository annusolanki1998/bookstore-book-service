package com.bridgelabz.bookstorebookservice.service;

import com.bridgelabz.bookstorebookservice.dto.BookDto;
import com.bridgelabz.bookstorebookservice.model.BookModel;
import com.bridgelabz.bookstorebookservice.util.Response;

import java.util.List;

public interface IBookService {
    Response addBook(BookDto bookDto, String token);

    Response updateBook(Long userId, String token, BookDto bookDto);

    List<BookModel> getBookData(String token);

    Response deleteBook(Long userId, String token);

    Response changeQuantity(Long id, Integer quantity, String token);

    Response changePrice(Long id, Integer price, String token);

    Response validateBookId(Long bookId);

    Response updateBookQuantity(Long bookId, Integer bookQuantity);
}
