package shop.mtcoding.jwtstudy.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @ToString // Dto는 ToString 막 사용 ~
@Getter
@Setter
// BoardDetailDBDto
// DB 조회 Dto : flat 하게 만들기 , Join 된거
public class BoardDetailDBdto {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private LocalDateTime userCreatedAt;
}
