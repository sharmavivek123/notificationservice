package com.shorturl.url.service;

import com.shorturl.url.model.UrlMapper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<UrlMapper,Integer> {

}
