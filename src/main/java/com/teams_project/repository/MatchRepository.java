package com.teams_project.repository;

import com.teams_project.repository.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer> {

    @Query("select m from Match m where m.teamHome= :idTeam and m.teamAway= :idTeam")
    public List<Match> getAllMatchesByTeam(Integer idTeam);
}
