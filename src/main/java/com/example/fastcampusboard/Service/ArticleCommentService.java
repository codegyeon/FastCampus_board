package com.example.fastcampusboard.Service;

import com.example.fastcampusboard.domain.Article;
import com.example.fastcampusboard.domain.ArticleComment;
import com.example.fastcampusboard.domain.UserAccount;
import com.example.fastcampusboard.dto.ArticleCommentDto;
import com.example.fastcampusboard.repository.ArticleCommentRepository;
import com.example.fastcampusboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleCommentRepository articleCommentRepository;
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(Long articleId){
        return List.of();
    }
//    public void saveArticleComment(ArticleCommentDto dto) {
//        try {
//            Article article = articleRepository.getReferenceById(dto.articleId());
//            UserAccount userAccount = userAccountRepository.getReferenceById(dto.userAccountDto().userId());
//            ArticleComment articleComment = dto.toEntity(article, userAccount);
//
//            if (dto.parentCommentId() != null) {
//                ArticleComment parentComment = articleCommentRepository.getReferenceById(dto.parentCommentId());
//                parentComment.addChildComment(articleComment);
//            } else {
//                articleCommentRepository.save(articleComment);
//            }
//        } catch (EntityNotFoundException e) {
//            log.warn("댓글 저장 실패. 댓글 작성에 필요한 정보를 찾을 수 없습니다 - {}", e.getLocalizedMessage());
//        }
//    }
//
//    public void deleteArticleComment(Long articleCommentId, String userId) {
//        articleCommentRepository.deleteByIdAndUserAccount_UserId(articleCommentId, userId);
//    }

}
