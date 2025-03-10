package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.dto.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replys")
public class ReplyController {
	private ReplyService replyService;

	public ReplyController(ReplyService replyService) {
		this.replyService = replyService;
	}

	@GetMapping("/{boardNum}")
	public List<ReplyDTO> selectReplyList(@PathVariable("boardNum") int boardNum){
		return replyService.selectReplyList(boardNum);
	}

	@PostMapping("/{boardNum}")
	public int insertReply(@PathVariable("boardNum") int boardNum,
												 @RequestBody ReplyDTO replyDTO){
		replyDTO.setBoardNum(boardNum);
		return replyService.insertReply(replyDTO);
	}

	@DeleteMapping("/{replyNum}")
	public int deleteReply(@PathVariable("replyNum") int replyNum){
		return replyService.deleteReply(replyNum);
	}

//	@GetMapping("/test")
//	public void searchTest(@RequestParam("age") int age,
//												 @RequestParam("name") String name){
//		System.out.println("age" + age);
//		System.out.println("name" + name);
//	}

	@GetMapping("/test")
	public void Test(TestDTO testDTO){
		System.out.println(testDTO);
	}
}
