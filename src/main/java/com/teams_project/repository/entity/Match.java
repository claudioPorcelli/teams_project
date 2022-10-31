package com.teams_project.repository.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Match {
    private int idMatch;
    private int teamHome;
    private int teamAway;
    private Integer goalHome;
    private Integer goalAway;
    private String result;
    private Team teamByTeamHome;
    private Team teamByTeamAway;
    private Collection<Stats> statsByIdMatch;

    @Id
    @Column(name = "ID_MATCH")
    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    @Basic
    @Column(name = "TEAM_HOME")
    public int getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(int teamHome) {
        this.teamHome = teamHome;
    }

    @Basic
    @Column(name = "TEAM_AWAY")
    public int getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(int teamAway) {
        this.teamAway = teamAway;
    }

    @Basic
    @Column(name = "GOAL_HOME")
    public Integer getGoalHome() {
        return goalHome;
    }

    public void setGoalHome(Integer goalHome) {
        this.goalHome = goalHome;
    }

    @Basic
    @Column(name = "GOAL_AWAY")
    public Integer getGoalAway() {
        return goalAway;
    }

    public void setGoalAway(Integer goalAway) {
        this.goalAway = goalAway;
    }

    @Basic
    @Column(name = "RESULT")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return idMatch == match.idMatch && teamHome == match.teamHome && teamAway == match.teamAway && Objects.equals(goalHome, match.goalHome) && Objects.equals(goalAway, match.goalAway) && Objects.equals(result, match.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, teamHome, teamAway, goalHome, goalAway, result);
    }

    @ManyToOne
    @JoinColumn(name = "TEAM_HOME", referencedColumnName = "ID_TEAM", nullable = false)
    public Team getTeamByTeamHome() {
        return teamByTeamHome;
    }

    public void setTeamByTeamHome(Team teamByTeamHome) {
        this.teamByTeamHome = teamByTeamHome;
    }

    @ManyToOne
    @JoinColumn(name = "TEAM_AWAY", referencedColumnName = "ID_TEAM", nullable = false)
    public Team getTeamByTeamAway() {
        return teamByTeamAway;
    }

    public void setTeamByTeamAway(Team teamByTeamAway) {
        this.teamByTeamAway = teamByTeamAway;
    }

    @OneToMany(mappedBy = "matchByMatch")
    public Collection<Stats> getStatsByIdMatch() {
        return statsByIdMatch;
    }

    public void setStatsByIdMatch(Collection<Stats> statsByIdMatch) {
        this.statsByIdMatch = statsByIdMatch;
    }
}
