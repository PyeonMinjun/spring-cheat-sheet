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
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy" + "년" + "MM" + "월" + "dd" + "일"));
        return format;
    }

    public String getUpdatedAt() {
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy" + "년" + "MM" + "월" + "dd" + "일"));
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
