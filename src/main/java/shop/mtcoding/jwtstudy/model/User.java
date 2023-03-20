package shop.mtcoding.jwtstudy.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Integer id; //
    private String username; //
    private String password;
    private String email;
    private LocalDateTime createdAt;
}