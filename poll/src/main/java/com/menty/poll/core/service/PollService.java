package com.menty.poll.core.service;

import com.menty.poll.api.model.PollRequest;
import com.menty.poll.core.model.Option;
import com.menty.poll.core.model.Poll;
import com.menty.poll.core.repository.PollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PollService {
    private final PollRepository pollRepository;

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    public Poll createPoll(PollRequest pollRequest) {
        var options = pollRequest.options().stream().map(Option::new).toList();
        return pollRepository.save(new Poll(pollRequest.title(), pollRequest.description(), options, 0L));
    }

    public void deletePoll(Long id) {
        pollRepository.deleteById(id);
    }
}
