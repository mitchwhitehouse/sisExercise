package com.mitch.sis.model;

public class Team {

    private Long id;
    private String name;
    private String city;
    private String owner;
    private Integer capacity;
    private String competition;
    private Integer numberPlayers;
    private Integer creationDate;
    
    public Team() {}

    public Team(long id, String name, String city, String owner, int capacity, String competition, int numberPlayers,
            int creationDate) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.owner = owner;
        this.capacity = capacity;
        this.competition = competition;
        this.numberPlayers = numberPlayers;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public Integer getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((competition == null) ? 0 : competition.hashCode());
        result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((numberPlayers == null) ? 0 : numberPlayers.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Team other = (Team) obj;
        if (capacity == null) {
            if (other.capacity != null)
                return false;
        } else if (!capacity.equals(other.capacity))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (competition == null) {
            if (other.competition != null)
                return false;
        } else if (!competition.equals(other.competition))
            return false;
        if (creationDate == null) {
            if (other.creationDate != null)
                return false;
        } else if (!creationDate.equals(other.creationDate))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (numberPlayers == null) {
            if (other.numberPlayers != null)
                return false;
        } else if (!numberPlayers.equals(other.numberPlayers))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        return true;
    }
    
    

}
