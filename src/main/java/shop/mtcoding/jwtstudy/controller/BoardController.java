package shop.mtcoding.jwtstudy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.jwtstudy.controller.Service.BoardService;
import shop.mtcoding.jwtstudy.dto.BoardDetailOutDto2;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardDetailOutDto2 dto = boardService.게시글상세보기(id);
        return ResponseEntity.ok().body(dto);
    }
}
