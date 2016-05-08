package com.mitch.sis;
import com.mitch.sis.configuration.ApplicationConfiguration;
import com.mitch.sis.dao.TeamDAO;
import com.mitch.sis.dao.impl.TeamDAOImpl;
import com.mitch.sis.resources.TeamResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SISTeamApiApplication extends Application<ApplicationConfiguration> {
    
    public static void main(String[] args) throws Exception {
        new SISTeamApiApplication().run(args);
    }

    @Override
    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        TeamDAO teamDAO = new TeamDAOImpl();
        final TeamResource teamResource = new TeamResource(teamDAO);
        environment.jersey().register(teamResource);
    }

}
