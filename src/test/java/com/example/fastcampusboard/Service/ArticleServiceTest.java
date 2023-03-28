package com.example.fastcampusboard.Service;

import com.example.fastcampusboard.domain.Article;
import com.example.fastcampusboard.domain.type.SearchType;
import com.example.fastcampusboard.dto.ArticleDto;
import com.example.fastcampusboard.repository.ArticleRepository;
import org.hibernate.mapping.Any;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;


@DisplayName("비즈니스 로직 - 게시판")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks
    private ArticleService sut;
    
    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticleList() {
        //Given

        //When
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE,"search keyword");

        //Then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면, 게시글를 반환")
    @Test
    void givenArticleId_whenSearchingArticles_thenReturnsArticle() {
        //Given

        //When
        ArticleDto articles = sut.searchArticle(1L);

        //Then
        assertThat(articles).isNotNull();
    }

//    @DisplayName("게시글 정보를 입력하면, 게시글을 생성한다.")
//    @Test
//    void givenArticleInfo_whenSavingArticle_thenSavesArticle() {
//        //given
//        ArticleDto dto = ArticleDto.of(LocalDateTime.now(),"uho","title","content","hashtag");
//        willDoNothing().given(ArticleRepository.save(any(Article.class)));
//
//        //when
//        sut.saveArticle(dto);
//        //then
//
//    }
}