package com.shorturl.url.model;

import java.util.List;

public class TeamModel {
    private String team;

    List<Developers> developers;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Developers> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developers> developers) {
        this.developers = developers;
    }
}
