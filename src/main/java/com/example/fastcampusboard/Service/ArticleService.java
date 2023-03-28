package com.example.fastcampusboard.Service;


import com.example.fastcampusboard.domain.Article;
import com.example.fastcampusboard.domain.type.SearchType;
import com.example.fastcampusboard.dto.ArticleDto;
import com.example.fastcampusboard.dto.ArticleUpdateDto;
import com.example.fastcampusboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String searchKeyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {

        return null;
    }

    public void saveArticle(ArticleDto dto ){

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto){

    }

    public void deleteArticle(long articleId){

    }
}
