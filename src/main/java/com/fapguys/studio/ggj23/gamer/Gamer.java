package com.fapguys.studio.ggj23.gamer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gamer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String uniqId;

    public Gamer() {
    }

    public Gamer(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format(
                "Gamer[id=%d, firstName='%s']",
                id, username);
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
