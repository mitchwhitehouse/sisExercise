package com.mitch.sis.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mitch.sis.dao.TeamDAO;
import com.mitch.sis.model.Team;

public class TeamDAOImpl implements TeamDAO{
    
    private final Map<Long, Team> teams;

    public TeamDAOImpl () {
        this.teams = buildTeamList();
    }
    
    private Map<Long, Team> buildTeamList() {
        Map<Long,Team> teams = new HashMap<Long,Team>();
        Team sheffield = new Team(1,"Sheffield Wednesday F.C", 
                "Sheffield", "Dejphon Chansiri", 39_732, "Championship", 34, 1867);
        Team derby = new Team(2, "Derby County F.C", 
                "Derby", "Mel Morris", 33_597, "Championship", 34, 1884);
        Team manchester = new Team(3, "Manchester United F.C", 
                "Manchester", "Manchester United plc", 75_653, "Premier League", 34, 1878);
        teams.put(1L,sheffield);
        teams.put(2L,derby);
        teams.put(3L,manchester);
        return teams;
    }
    
    @Override
    public List<Team> getTeams() {
        return new ArrayList<Team>(teams.values());
    }

    @Override
    public Team getTeam(long id) {
        return teams.get(id);
    }

    @Override
    public List<Team> getTeamsSortBy() {
        List<Team> teams = getTeams();
        
        Collections.sort(teams,new Comparator<Team>() {
            @Override
            public int compare(Team a, Team b) {
                return a.getCapacity().compareTo(b.getCapacity());
            }
        });
        return teams;
    }

}
