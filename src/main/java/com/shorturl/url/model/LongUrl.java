package com.shorturl.url.model;

public class LongUrl {
    String longUrl;
    String src;

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public LongUrl(String longUrl, String src) {
        this.longUrl = longUrl;
        this.src = src;
    }
}
