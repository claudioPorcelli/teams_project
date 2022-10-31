package com.teams_project.repository.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Team {
    private int idTeam;
    private String name;
    private String league;
    private Collection<Match> matchesByIdTeam;
    private Collection<Match> matchesByIdTeam_0;
    private Collection<Player> playersByIdTeam;

    @Id
    @Column(name = "ID_TEAM")
    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "LEAGUE")
    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return idTeam == team.idTeam && Objects.equals(name, team.name) && Objects.equals(league, team.league);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTeam, name, league);
    }

    @OneToMany(mappedBy = "teamByTeamHome")
    public Collection<Match> getMatchesByIdTeam() {
        return matchesByIdTeam;
    }

    public void setMatchesByIdTeam(Collection<Match> matchesByIdTeam) {
        this.matchesByIdTeam = matchesByIdTeam;
    }

    @OneToMany(mappedBy = "teamByTeamAway")
    public Collection<Match> getMatchesByIdTeam_0() {
        return matchesByIdTeam_0;
    }

    public void setMatchesByIdTeam_0(Collection<Match> matchesByIdTeam_0) {
        this.matchesByIdTeam_0 = matchesByIdTeam_0;
    }

    @OneToMany(mappedBy = "teamByTeam")
    public Collection<Player> getPlayersByIdTeam() {
        return playersByIdTeam;
    }

    public void setPlayersByIdTeam(Collection<Player> playersByIdTeam) {
        this.playersByIdTeam = playersByIdTeam;
    }
}
