package com.shorturl.url.service.impl;

import com.shorturl.url.model.Const;
import com.shorturl.url.model.LongUrl;
import com.shorturl.url.model.UrlMapper;
import com.shorturl.url.service.RepositoryInterface;
import com.shorturl.url.service.SortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortUrlServiceImp implements SortUrlService {

    @Autowired
    RepositoryInterface repositoryInterface;

    @Override
    public String createSortToLongUrl(LongUrl url) {

        String sortUrl = getSorturl(url);

      //  UrlMapper urlMapper=new UrlMapper(1,sortUrl,"https://stackoverflow.com/questions/52804228/failed-to-load-driver-class-com-mysql-jdbc-driver");
        UrlMapper urlMapper=new UrlMapper();
         urlMapper.setLongUrl(url.getLongUrl());
         urlMapper.setSortUrl(sortUrl);
        repositoryInterface.save(urlMapper);
        System.out.println(urlMapper.getId());
        return sortUrl;
    }

    private String getSorturl(LongUrl url) {
        return "hsere.tf.v";
    }
}
