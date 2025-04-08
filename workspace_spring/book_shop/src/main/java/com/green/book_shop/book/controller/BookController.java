package com.green.book_shop.book.controller;

import com.green.book_shop.book.dto.BookDTO;
import com.green.book_shop.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
  private final BookService bookService;

  //도서 등록 api
  //post ~/books

  @PostMapping("")
  public void regBook(BookDTO bookDTO,
                      @RequestPart(name = "mainImg", required = true) MultipartFile mainImg,
                      @RequestPart(name = "subImg", required = true) MultipartFile subImg){
    //데이터확인용
    System.out.println(bookDTO);
    System.out.println(mainImg);
    System.out.println(subImg);

    //첨부파일(도서이미지)업로드
//    bookService.insertBook(bookDTO);
  }



}















