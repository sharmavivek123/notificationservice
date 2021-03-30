package com.shorturl.url.controller;

import com.google.gson.Gson;
import com.shorturl.url.model.TeamModel;
import com.shorturl.url.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AckoController {


    @Autowired
    Gson gson;

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/create/team",method = RequestMethod.POST)
    public String createTeamAndDevelopers(@RequestBody String body){
        TeamModel teamModel = gson.fromJson(body, TeamModel.class);
        return teamService.createTeam(teamModel);
    }

    @RequestMapping(value = "/notify/team/{team_id}",method = RequestMethod.GET)
    public String notifyTeam(@PathVariable("team_id") Long teamId){
        System.out.println(teamId);

        teamService.notifyTeamMembers(String.valueOf(teamId));

       return null;
    }


}
