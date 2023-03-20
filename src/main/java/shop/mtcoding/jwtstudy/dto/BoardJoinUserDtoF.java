package shop.mtcoding.jwtstudy.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @ToString
@Getter
@Setter
public class BoardJoinUserDtoF {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    // 엔티티 복제는 무조건 내부 클래스로 만들기
    // @ToString
    @Getter
    @Setter
    public static class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;
    }
}
