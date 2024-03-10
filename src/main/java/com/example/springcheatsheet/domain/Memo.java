package com.example.springcheatsheet.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

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



@Getter
public class Memo {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String author;
    private String category;
    private String primary;

    public Memo(String title, String content, String author, String category, String primary) {
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.author = author;
        this.category = category;
        this.primary = primary;
    }



}