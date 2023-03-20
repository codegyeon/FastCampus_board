package com.example.fastcampusboard.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class ArticleComment {


    private Long id;
    private Article article; //게시글 id
    private String content; // 본문

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자

}
