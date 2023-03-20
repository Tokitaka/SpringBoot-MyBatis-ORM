package shop.mtcoding.jwtstudy.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.jwtstudy.dto.BoardJoinUserDtoF;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    // public BoardDetailDBdto findByIdJoinUser(int id);

    // public BoardJoinUserDto findByIdJoinUser2(int id);

    public BoardJoinUserDtoF findByIdJoinUserF(Integer id);

}
