package com.menty.poll.api.web.v1;

import com.menty.poll.api.model.PollRequest;
import com.menty.poll.core.model.Poll;
import com.menty.poll.core.service.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/polls")
@RequiredArgsConstructor
public class PollController {
    private final PollService pollService;

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPollById(@PathVariable long id) {
        return pollService.getPollById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Poll> createPoll(@RequestBody @Validated PollRequest pollRequest) {
        var poll = pollService.createPoll(pollRequest);
        return ResponseEntity.created(URI.create("/api/v1/polls/" + poll.getId())).body(poll);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePoll(@PathVariable long id) {
        pollService.deletePoll(id);
        return ResponseEntity.noContent().build();
    }
}
