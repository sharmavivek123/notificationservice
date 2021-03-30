package com.shorturl.url.model;


import javax.persistence.*;


@Entity
@Table(name = "sort_to_long_url")
public class UrlMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;


    @Column(name = "sort_url")
    private String sortUrl;

    @Column(name = "long_url")
    private String longUrl;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSortUrl() {
        return sortUrl;
    }

    public void setSortUrl(String sortUrl) {
        this.sortUrl = sortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public UrlMapper() {
    }

    public UrlMapper(long id, String sortUrl, String longUrl) {
        this.id = id;
        this.sortUrl = sortUrl;
        this.longUrl = longUrl;
    }
}
