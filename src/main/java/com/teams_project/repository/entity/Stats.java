package com.teams_project.repository.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(StatsPK.class)
public class Stats {
    private int match;
    private int player;
    private Integer goal;
    private Integer card;
    private int presence;
    private Match matchByMatch;
    private Player playerByPlayer;

    @Id
    @Column(name = "MATCH")
    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    @Id
    @Column(name = "PLAYER")
    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    @Basic
    @Column(name = "GOAL")
    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    @Basic
    @Column(name = "CARD")
    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    @Basic
    @Column(name = "PRESENCE")
    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return match == stats.match && player == stats.player && presence == stats.presence && Objects.equals(goal, stats.goal) && Objects.equals(card, stats.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(match, player, goal, card, presence);
    }

    @ManyToOne
    @JoinColumn(name = "MATCH", referencedColumnName = "ID_MATCH", nullable = false)
    public Match getMatchByMatch() {
        return matchByMatch;
    }

    public void setMatchByMatch(Match matchByMatch) {
        this.matchByMatch = matchByMatch;
    }

    @ManyToOne
    @JoinColumn(name = "PLAYER", referencedColumnName = "ID_PLAYER", nullable = false)
    public Player getPlayerByPlayer() {
        return playerByPlayer;
    }

    public void setPlayerByPlayer(Player playerByPlayer) {
        this.playerByPlayer = playerByPlayer;
    }
}
