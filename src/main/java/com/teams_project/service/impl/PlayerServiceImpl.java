package com.teams_project.service.impl;

import com.teams_project.repository.PlayerRepository;
import com.teams_project.repository.entity.Player;
import com.teams_project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerRepository repo;

    @Override
    public Player insertPlayer(Player player) {
        Player result= repo.save(player);
        return result;
    }

    @Override
    public List<Player> getPlayersByTeam(Integer idTeam) {
        List<Player> result= repo.getByTeam(idTeam);
        return result;
    }

    @Override
    public Optional<Player> getPlayer(Integer idPlayer) {
        return repo.findById(idPlayer);
    }

    @Override
    public void deletePlayer(Integer idPlayer) {
        repo.deleteById(idPlayer);

    }
}
