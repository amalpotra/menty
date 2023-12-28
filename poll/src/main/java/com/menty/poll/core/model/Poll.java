package com.menty.poll.core.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Collection;

@Entity
public class Poll {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    @OneToMany
    @JoinColumn(name = "poll_id")
    private Collection<Option> options;
    @Column(name = "owner_id")
    private long ownerId;
    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;
}
