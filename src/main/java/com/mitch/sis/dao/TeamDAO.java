package com.mitch.sis.dao;

import java.util.List;

import com.mitch.sis.model.Team;

public interface TeamDAO {

    public List<Team> getTeams();
    public Team getTeam(long id);
    public List<Team> getTeamsSortBy();
    
}

