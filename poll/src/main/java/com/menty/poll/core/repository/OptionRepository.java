package com.menty.poll.core.repository;

import com.menty.poll.core.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
