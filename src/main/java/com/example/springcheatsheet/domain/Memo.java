package com.example.springcheatsheet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Blob;
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


@Entity
public class Memo {

    @Id @GeneratedValue
    @Column(name = "memo_id")
    private Long id;

    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String author;
    private String category;
    private String rank;

}