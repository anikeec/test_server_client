package com.apu.temp.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apu
 */
public class News {
    @JsonProperty("status")
    private String status;
    @JsonProperty("sources")
    private List<NewOne> sources;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<NewOne> getSources() {
        return sources;
    }

    public void setSources(List<NewOne> sources) {
        this.sources = sources;
    }

            
}
