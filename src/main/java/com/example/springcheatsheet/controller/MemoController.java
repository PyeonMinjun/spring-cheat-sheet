package com.example.springcheatsheet.controller;

import com.example.springcheatsheet.domain.Memo;
import com.example.springcheatsheet.dto.response.MemoResponseDto;
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
    @GetMapping("/title")
    public MemoResponseDto getMemo() {
        MemoResponseDto memoResponseDto = new MemoResponseDto("1","오늘의 할일", "사용자1","오늘","보통");

        return memoResponseDto;

    }

}
