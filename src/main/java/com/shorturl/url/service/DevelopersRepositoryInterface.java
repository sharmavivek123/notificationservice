package com.shorturl.url.service;

import com.shorturl.url.model.DevelopersMapper;
import com.shorturl.url.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface DevelopersRepositoryInterface extends JpaRepository<DevelopersMapper,Integer> {

//    @Query(value = "SELECT p FROM DevelopersMapper where p.teamId = :teamId")
//    DevelopersMapper findByTeamId(@Param("teamId") String teamId);


}
