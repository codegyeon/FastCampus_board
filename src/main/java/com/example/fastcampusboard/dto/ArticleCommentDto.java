package com.example.fastcampusboard.dto;

import java.time.LocalDateTime;

public record ArticleCommentDto(
        LocalDateTime createdAt,
        String createdBy,
        String title,
        String content,
        LocalDateTime modifiedAt,
        String modifiedBy
) {
    public static ArticleCommentDto of(LocalDateTime createdAt, String createdBy, String title, String content, LocalDateTime modifiedAt, String modifiedBy) {
        return new ArticleCommentDto(createdAt, createdBy, title, content, modifiedAt, modifiedBy);
    }
}
