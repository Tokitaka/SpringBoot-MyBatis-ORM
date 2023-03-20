package shop.mtcoding.jwtstudy.model;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.jwtstudy.dto.BoardDetailOutDto;

import java.util.List;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutDto findByIdJoinUser(int id);

}
