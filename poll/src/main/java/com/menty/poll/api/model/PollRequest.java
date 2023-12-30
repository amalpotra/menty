package com.menty.poll.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Collection;

public record PollRequest(
        @NotBlank String title,
        String description,
        @NotEmpty Collection<@NotBlank String> options
) {
}
