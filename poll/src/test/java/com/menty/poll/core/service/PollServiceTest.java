package com.menty.poll.core.service;

import com.menty.poll.api.model.PollRequest;
import com.menty.poll.core.model.Option;
import com.menty.poll.core.model.Poll;
import com.menty.poll.core.repository.PollRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PollServiceTest {
    @Mock
    private PollRepository pollRepository;
    @InjectMocks
    private PollService pollService;

    @Test
    void testGetPollById() {
        when(pollRepository.findById(1L)).thenReturn(Optional.of(new Poll()));
        assertThat(pollService.getPollById(1L)).containsInstanceOf(Poll.class);
    }

    @Test
    void testCreatePoll() {
        var pollRequest = new PollRequest("title", "description", List.of("option1"));
        var poll = new Poll("title", "description", List.of(new Option("option1")), 0L);
        when(pollRepository.save(any(Poll.class))).thenReturn(poll);
        assertThat(pollService.createPoll(pollRequest)).isEqualTo(poll);
    }

    @Test
    void testDeletePoll() {
        pollService.deletePoll(1L);
        verify(pollRepository).deleteById(1L);
    }
}
