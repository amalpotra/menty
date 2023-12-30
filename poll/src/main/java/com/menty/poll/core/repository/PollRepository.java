package com.menty.poll.core.repository;

import com.menty.poll.core.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
