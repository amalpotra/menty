package com.menty.poll.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "poll_id")
    private long pollId;
    @Column(name = "option_id")
    private long optionId;
    @Column(name = "voter_id")
    private long voterId;
    @Column(name = "created_by")
    private long createdBy;
    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;
}
