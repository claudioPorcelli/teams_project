package com.teams_project.service;

import com.teams_project.repository.entity.Team;


import java.util.List;
import java.util.Optional;


public interface TeamService {

  public List<Team> getAllTeams();

  public Optional<Team> getTeam(Integer idTeam);

  public void deleteTeam(Integer idTeam);

  public Team insertTeam(Team team);
}
