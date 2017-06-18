package com.apu.temp.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author apu
 */
public class NewOne {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;
    @JsonProperty("category")
    private String category;
    @JsonProperty("language")
    private String language;
    @JsonProperty("country")
    private String country;
    @JsonProperty("urlsToLogos")
    private NewsUrls urlsToLogos;
    @JsonProperty("sortBysAvailable")
    private List<String> sortBysAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public NewsUrls getUrlsToLogos() {
        return urlsToLogos;
    }

    public void setUrlsToLogos(NewsUrls urlsToLogos) {
        this.urlsToLogos = urlsToLogos;
    }

    public List<String> getSortBysAvailable() {
        return sortBysAvailable;
    }

    public void setSortBysAvailable(List<String> sortBysAvailable) {
        this.sortBysAvailable = sortBysAvailable;
    }

}
