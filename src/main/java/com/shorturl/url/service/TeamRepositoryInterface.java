package com.shorturl.url.service;

import com.shorturl.url.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepositoryInterface extends JpaRepository<Team,Integer> {

}
