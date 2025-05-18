package com.minse0.spring.test.test02;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lifecycle/test03")
public class ResponseEntityController {

    @RequestMapping("/4")
    public ResponseEntity<Post> statusResponse() {
        Post post = new Post(
            "안녕하세요 가입인사 드립니다.",
            "baeguni",
            "안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다."
        );

        ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
        return entity;
    }
}