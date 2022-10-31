package com.teams_project.service;

import com.teams_project.repository.entity.Match;

import java.util.List;

public interface MatchService {

    public List<Match> getAllMatches();

    public Match insertMatch(Match match);

    public List<Match> getAllMatchesByTeam(Integer idTeam);

    public void deleteMatch(Integer idMatch);

}
