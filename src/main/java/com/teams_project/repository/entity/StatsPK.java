package com.teams_project.repository.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StatsPK implements Serializable {
    private int match;
    private int player;

    @Column(name = "MATCH")
    @Id
    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    @Column(name = "PLAYER")
    @Id
    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsPK statsPK = (StatsPK) o;
        return match == statsPK.match && player == statsPK.player;
    }

    @Override
    public int hashCode() {
        return Objects.hash(match, player);
    }
}
