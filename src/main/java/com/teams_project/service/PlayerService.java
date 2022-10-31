package com.teams_project.service;

import com.teams_project.repository.entity.Player;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface PlayerService {

    public Player insertPlayer(Player player);

    public List<Player> getPlayersByTeam(Integer idTeam);

    public Optional<Player> getPlayer(Integer idPlayer);

    public void deletePlayer(Integer idPlayer);


}
