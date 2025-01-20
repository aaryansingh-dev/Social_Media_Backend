package com.social.media.models;

import jakarta.persistence.*;
import lombok.extern.java.Log;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private SocialUser user;
}
