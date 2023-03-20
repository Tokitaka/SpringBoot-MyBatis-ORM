package shop.mtcoding.jwtstudy.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
}
