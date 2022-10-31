package com.teams_project.service.impl;

import com.teams_project.repository.MatchRepository;
import com.teams_project.repository.entity.Match;
import com.teams_project.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository repo;

    @Override
    public List<Match> getAllMatches() {
        List<Match> result= new ArrayList<>();
        result= repo.findAll();
        return result;
    }

    @Override
    public Match insertMatch(Match match) {
        Match result= repo.save(match);
        return result;
    }

    @Override
    public List<Match> getAllMatchesByTeam(Integer idTeam) {
        List<Match> result= new ArrayList<>();
        result=repo.getAllMatchesByTeam(idTeam);
        return result;
    }

    @Override
    public void deleteMatch(Integer idMatch) {

    }
}
