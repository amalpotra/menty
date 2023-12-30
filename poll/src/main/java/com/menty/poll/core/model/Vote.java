package com.menty.poll.core.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "votes")
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "poll_id")
    private Long pollId;
    @Column(name = "option_id")
    private Long optionId;
    @Column(name = "voter_id")
    private Long voterId;
    @Column(name = "created_by")
    private Long createdBy;
    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;
}
