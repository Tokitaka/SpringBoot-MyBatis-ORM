package shop.mtcoding.jwtstudy.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// @ToString
public class UserDto {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;
}