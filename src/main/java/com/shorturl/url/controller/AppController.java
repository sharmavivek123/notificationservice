package com.shorturl.url.controller;

import com.shorturl.url.model.LongUrl;
import com.shorturl.url.service.SortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;


@RestController
public class AppController {


    @Autowired
    SortUrlService service;

//    private static final Gson gson = new Gson();

    @Autowired
    Gson gson;


    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String m1(){
        return "healthy";
       // return service.createSortToLongUrl("hell");
    }

    @RequestMapping(value = "/sortUrl",method = RequestMethod.POST)
    public String convertLongIntoSort(@RequestBody String body){

        LongUrl longUrl = gson.fromJson(body, LongUrl.class);

        String sortToLongUrl = service.createSortToLongUrl(longUrl);

        return sortToLongUrl;

    }
}
