package com.example.springcheatsheet.controller;

import com.example.springcheatsheet.domain.Memo;
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
    public Memo getMemo() {
        Memo memo = new Memo("1","오늘의 할일",
                "24-03-09","24-03-09",
        "사용자1","오늘","보통");

        return memo;

    }

}
