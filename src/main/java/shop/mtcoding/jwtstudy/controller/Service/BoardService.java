package shop.mtcoding.jwtstudy.controller.Service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.jwtstudy.dto.BoardDetailInDto;
import shop.mtcoding.jwtstudy.dto.BoardDetailOutDto;
import shop.mtcoding.jwtstudy.dto.BoardDetailOutDto2;
import shop.mtcoding.jwtstudy.model.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 게시글상세보기(Integer id) {
        // service 에서 dto를 가공한다
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그 : " + boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : " + boardDetailOutDto2);

        return boardDetailOutDto2;
    }

}
