package shop.mtcoding.jwtstudy.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId; // @Id
    private Timestamp createdAt;
}