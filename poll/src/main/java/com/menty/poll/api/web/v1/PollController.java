package com.menty.poll.api.web.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/polls")
public class PollController {
    @GetMapping
    public ResponseEntity<String> getPoll() {
        return ResponseEntity.ok("Hello World!");
    }
}
