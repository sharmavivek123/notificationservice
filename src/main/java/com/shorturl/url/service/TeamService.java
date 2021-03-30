package com.shorturl.url.service;

import com.shorturl.url.model.TeamModel;

public interface TeamService {
    public String createTeam(TeamModel teamModel);
    public String notifyTeamMembers(String teamId);
    String sendNotificationOnMobile(String mobile);
}
