package com.mitch.sis.model;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.fest.assertions.api.Assertions.assertThat;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialisationTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private static final Team TEAM = new Team(2, "Derby County F.C", 
            "Derby", "Mel Morris", 33_597, "Championship", 34, 1884);
    
    @Test
    public void serializesToJSON() throws Exception {       
        assertThat(MAPPER.writeValueAsString(TEAM))
        .isEqualTo(fixture("fixtures/team.json"));
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        assertThat(MAPPER.readValue(fixture("fixtures/team.json"), Team.class))
        .isEqualTo(TEAM);
    }
}