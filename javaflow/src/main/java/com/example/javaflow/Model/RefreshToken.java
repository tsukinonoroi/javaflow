package com.example.javaflow.Model;

import jakarta.persistence.*;
import lombok.Data;
import com.example.javaflow.Model.User;
import java.time.Instant;

@Entity
@Table
@Data
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String token;

    private Instant expiryDate;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
