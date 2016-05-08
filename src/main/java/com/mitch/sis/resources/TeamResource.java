package com.mitch.sis.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mitch.sis.dao.TeamDAO;
import com.mitch.sis.model.Team;

import io.dropwizard.jersey.params.LongParam;

@Path("/team")
@Produces(MediaType.APPLICATION_JSON)
public class TeamResource {
    
    private final TeamDAO teamDao;
    
    public TeamResource(TeamDAO teamDao) {
        this.teamDao = teamDao;
    }
    
    @GET
    @Path("/{id}")
    public Response getTeam(@PathParam("id") LongParam id) {
        Team team = teamDao.getTeam(id.get());
        if (team == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(team).build();
    }
    
    @GET
    public Response getAllTeams(@DefaultValue("none") @QueryParam("sortBy") String sortBy) {
        // TDOD Make generic so can sort by any property!
        if (sortBy.equalsIgnoreCase("capacity"))
        return Response.ok(teamDao.getTeamsSortBy()).build();
        else return Response.ok(teamDao.getTeams()).build();
    }
    
}
