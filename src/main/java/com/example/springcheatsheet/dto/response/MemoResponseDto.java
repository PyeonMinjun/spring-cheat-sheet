package com.example.springcheatsheet.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemoResponseDto {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String author;
    private String category;
    private String primary;

    public MemoResponseDto(String title, String content,String author, String category, String primary) {
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.author = author;
        this.category = category;
        this.primary = primary;
    }

    public String getTitle() {
        return title; // 필드를 반환
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        String format = createdAt.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
        return format;  // 디버깅 편해서
    }

    public String getUpdatedAt() {
        String format = updatedAt.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
        return format;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getPrimary() {
        return primary;
    }
}
