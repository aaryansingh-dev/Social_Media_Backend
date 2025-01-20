package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class SocialGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "groups")
    @JsonIgnore
    private Set<SocialUser> socialUsers = new HashSet<>();

}
