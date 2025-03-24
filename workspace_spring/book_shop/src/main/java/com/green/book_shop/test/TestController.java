package com.green.book_shop.test;

import com.green.book_shop.book.dto.BookDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {

  @GetMapping("/1")
  public int test1(){
    return 5;
  }

  //첨부파일을 자바에서 받기위해 FormData 객체를 사용
  //전달되는 데이터의 형태도 multipart/form-data형식으로 전달
  //이렇게 전달되는 데이터를 받기 위한 코드를 변경했으므로
  //평소와 다르게 전달 받아야함
  //dto객체로 전달된 데이터를 받되 @RequestBody어노테이션은 사용x
  //그렇다고 DTO 객체로 첨부파일 정보도 받는것은 아님

  //첨부파일 데이터를 받을때는 MultiPartFile 객체를 사용한다
  //첨부파일 연습1
  @PostMapping("/upload1")
  public void upload1(@RequestPart("firstFile") MultipartFile multipartFile,
                      BookDTO bookDTO){
    System.out.println(bookDTO);
    System.out.println(multipartFile);
    System.out.println("첨부된원본파일명"+multipartFile.getOriginalFilename());

    //업로드 될 경로 필요
    String uploadPath = "D:\\01-STUDY\\devel\\workspace\\workspace_react\\book_shop\\src\\upload\\";

    //첨부한 원본 파일명
    String attachedFileName = multipartFile.getOriginalFilename();

    //업로드 경로, 파일명을 연결
    File f = new File(uploadPath + attachedFileName);

    //파일첨부
		try {
      //파일 첨부기능
			multipartFile.transferTo(f);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

//  @PostMapping("/upload1")
//  public void upload1(@RequestParam("firstFile") MultipartFile mFile,
//                      BookDTO bookDTO){
//    System.out.println(mFile);
//    System.out.println(bookDTO);
//  }

}










