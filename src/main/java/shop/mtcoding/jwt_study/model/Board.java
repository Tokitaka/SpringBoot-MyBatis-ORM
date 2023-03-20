package shop.mtcoding.jwt_study.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private User user;
    private Timestamp createdAt;
}