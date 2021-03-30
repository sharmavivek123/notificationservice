package com.shorturl.url.service.impl;

import com.shorturl.url.model.Developers;
import com.shorturl.url.model.DevelopersMapper;
import com.shorturl.url.model.Team;
import com.shorturl.url.model.TeamModel;
import com.shorturl.url.service.DevelopersRepositoryInterface;
import com.shorturl.url.service.TeamRepositoryInterface;
import com.shorturl.url.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {


    @Autowired
    TeamRepositoryInterface teamRepositoryInterface;

    @Autowired
    DevelopersRepositoryInterface developersRepositoryInterface;

    @Override
    public String createTeam(TeamModel teamModel) {

        try{
         //   vallidation(teamModel)
            Team team=new Team();
            createTeamPayLoad(team,teamModel);
            teamRepositoryInterface.save(team);
            createDevelopersPayLoad(teamModel,team.getId());
            return "Success";
        }
        catch (Exception ex){
            System.out.println("exception occurs : " +ex);
            System.out.println("exception occurs : " +ex.getMessage());
            return "Failure";
        }

    }



    private void createDevelopersPayLoad(TeamModel teamModel, long id) throws InterruptedException {

        List<Developers> developersList = teamModel.getDevelopers();
        if(developersList!=null && developersList.size()>0){

            for(Developers developers: developersList){
                DevelopersMapper developersMapper=new DevelopersMapper();
                  developersMapper.setDeveloperName(developers.getDevName());
                  developersMapper.setPhone(developers.getPhoneNumber());
                  developersMapper.setTeamId(String.valueOf(id));
                developersRepositoryInterface.save(developersMapper);
            }
        }

    }

    private void createTeamPayLoad(Team team, TeamModel teamModel) {
        team.setTeamName(teamModel.getTeam());
    }


    @Override
    public String notifyTeamMembers(String teamId) {

        List<DevelopersMapper> allDevelopersMapperList = developersRepositoryInterface.findAll();

        List<DevelopersMapper> developersMappers =new ArrayList<>();
        if(allDevelopersMapperList!=null && allDevelopersMapperList.size()>0){
             developersMappers = allDevelopersMapperList.stream().
                    filter(p -> p.getTeamId().equalsIgnoreCase(teamId)).collect(Collectors.toList());
        }

        String mobile = fetchRandomMobileNumber(developersMappers);

        sendNotificationOnMobile(mobile);


        return null;
    }



    private String fetchRandomMobileNumber(List<DevelopersMapper> developersMappers) {
        if(developersMappers!=null && developersMappers.size()>0){
           return developersMappers.get(0).getPhone() ;
        }
        return null;
    }

    @Override
    public String sendNotificationOnMobile(String mobile) {
        System.out.println("Send message on mobile No  "+ mobile);


        return null;
    }
}
