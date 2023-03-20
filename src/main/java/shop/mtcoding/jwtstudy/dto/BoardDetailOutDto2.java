package shop.mtcoding.jwtstudy.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// page : 게시글 상세보기
@Getter
@Setter
@ToString
public class BoardDetailOutDto2 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user; // @Id
    private Timestamp createdAt;

    public BoardDetailOutDto2(BoardDetailOutDto board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user = new UserDto(
                board.getUserId(),
                board.getUserUsername(),
                board.getUserPassword(),
                board.getUserEmail(),
                board.getUserCreatedAt());
        this.createdAt = board.getCreatedAt();
    }

    @Getter
    @Setter
    @ToString
    public class UserDto {
        private Integer id; //
        private String username; //
        private String password;
        private String email;
        private LocalDateTime createdAt;

        // 각각을 getter setter 하기 어려움
        public UserDto(Integer id, String username, String password, String email, LocalDateTime createdAt) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.createdAt = createdAt;
        }
    }

}
