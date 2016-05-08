Tools Used
----------

Dropwizard - http://www.dropwizard.io/0.9.2/docs/
Dropwizard is a popular Java framework for making REST services and bundles a number of other great frameworks together, great for prototyping but can also work in production.

Uses:
- Jetty 
- Jackson
- Jersey

Gradle for build and dependency management

Junit

Build/Running Instructions
---------------------------
Build Fat Jar
gradle jar (creates an fat jar with all dependencies in build/libs)

Run from sis directory
'java -jar ./build/libs/sis.jar server sis.yaml'

Note: The default port the jetty server starts on is 8080. This can be configured by changing the value in the sis.yaml file to another free port. 

Example URLS
------------
http://localhost:8080/team (lists all teams)
http://localhost:8080/team?sortBy=capacity (lists all teams sorted by capacity)
http://localhost:8080/team/1 (gets the team with 'id' = 1)

