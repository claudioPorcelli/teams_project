package com.teams_project.service.impl;

import com.teams_project.repository.TeamRepository;
import com.teams_project.repository.entity.Team;
import com.teams_project.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository repo;

    @Override
    public List<Team> getAllTeams() {
        List<Team> result= new ArrayList<>();
        result= repo.findAll();
        return result;
    }

    @Override
    public Optional<Team> getTeam(Integer idTeam) {

        return repo.findById(idTeam);
    }

    @Override
    public void deleteTeam(Integer idTeam) {
        repo.deleteById(idTeam);

    }

    @Override
    public Team insertTeam(Team team) {
        return repo.save(team);
    }

}
