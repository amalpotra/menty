package com.menty.poll.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Collection;

@Entity
@Table(name = "polls")
@Getter @Setter @NoArgsConstructor
public class Poll {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "poll_id")
    private Collection<Option> options;
    @Column(name = "owner_id")
    private Long ownerId;
    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    public Poll(String title, String description, Collection<Option> options, long ownerId) {
        this.title = title;
        this.description = description;
        this.options = options;
        this.ownerId = ownerId;
    }
}
