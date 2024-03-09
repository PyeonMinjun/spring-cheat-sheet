package com.example.springcheatsheet.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * {
 *    "title" : "1이요 ?"
 *    "content" : "오늘의 할일"
 *    "createdAt" : "24-03-09"
 *    "author" : "사용자1"
 *    "category" : "오늘"
 *    "primary" : "보통"
 * }
 */


@AllArgsConstructor
@Getter
public class Memo {
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;
    private String author;
    private String category;
    private String primary;



}