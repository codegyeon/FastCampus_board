package com.example.fastcampusboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
        @Index(columnList = "email", unique = true),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@Entity
public class UserAccount {
    @Id
    private String userId;
    @Setter
    @Column
    private String userPassword;
    @Setter
    @Column(length = 100)
    private String email;
    @Setter
    @Column(length = 100)
    private String nickname;
    @Setter
    private String memo;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt; // 생성일시

    @CreatedBy
    @Column(nullable = false,length = 100,updatable = false)
    private String createdBy; // 생성자

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime modifiedAt; // 수정일시

    @LastModifiedBy
    @Column(nullable = false,length = 100)
    private String modifiedBy; // 수정자

    public UserAccount() {
    }

    private UserAccount(String userId, String userPassword, String email, String nickname, String memo, String createdBy) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.email = email;
        this.nickname = nickname;
        this.memo = memo;
        this.createdBy = createdBy;
        this.modifiedBy = createdBy;
    }

    public static UserAccount of(String userId, String userPassword, String email, String nickname, String memo){
        return UserAccount.of(userId,userPassword,email,memo,null);
    }

    public static UserAccount of(String userId, String userPassword, String email, String nickname, String memo,String createdBy){
        return new UserAccount(userId, userPassword, email, nickname, memo, createdBy);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return this.getUserId() != null && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
