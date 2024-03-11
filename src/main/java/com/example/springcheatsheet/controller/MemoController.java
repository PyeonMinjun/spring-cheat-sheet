package com.example.springcheatsheet.controller;

import com.example.springcheatsheet.dto.response.MemoResponseDto;
import com.example.springcheatsheet.service.MemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoController {
//
//    /**
//     * {
//     *    "title" : "1"
//     *    "content" : "오늘의 할일"
//     *    "createdAt" : "24-03-09"
//     *    "updatedAt" :"24-03-09"
//     *    "author" : "사용자1"
//     *    "category" : "오늘"
//     *    "primary" : "보통"
//     * }
//     */
//
    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }


    @GetMapping("/title")
    public MemoResponseDto getMemo() {
        return memoService.getMemo();
    }

}
