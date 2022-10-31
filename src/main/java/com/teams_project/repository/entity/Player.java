package com.teams_project.repository.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Player {
    private int idPlayer;
    private String name;
    private String lastName;
    private String role;
    private Integer team;
    private Integer number;
    private Team teamByTeam;
    private Collection<Stats> statsByIdPlayer;

    @Id
    @Column(name = "ID_PLAYER")
    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
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
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "TEAM")
    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    @Basic
    @Column(name = "NUMBER")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return idPlayer == player.idPlayer && Objects.equals(name, player.name) && Objects.equals(lastName, player.lastName) && Objects.equals(role, player.role) && Objects.equals(team, player.team) && Objects.equals(number, player.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlayer, name, lastName, role, team, number);
    }

    @ManyToOne
    @JoinColumn(name = "TEAM", referencedColumnName = "ID_TEAM")
    public Team getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(Team teamByTeam) {
        this.teamByTeam = teamByTeam;
    }

    @OneToMany(mappedBy = "playerByPlayer")
    public Collection<Stats> getStatsByIdPlayer() {
        return statsByIdPlayer;
    }

    public void setStatsByIdPlayer(Collection<Stats> statsByIdPlayer) {
        this.statsByIdPlayer = statsByIdPlayer;
    }
}
