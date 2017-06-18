package com.apu.temp.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 *
 * @author apu
 */
public class TestClientJersey {
    
    public static void main(String[] args) {
	try {

		Client clientArticle = Client.create();

		WebResource webResourceArticle = clientArticle
		   .resource("https://newsapi.org/v1/articles?source=techcrunch&apiKey=388dc07947b24c86ba45ab95e7027270");

		ClientResponse responseArticle = webResourceArticle.accept("application/json")
                   .get(ClientResponse.class);

		if (responseArticle.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ responseArticle.getStatus());
		}

		String outputArticle = responseArticle.getEntity(String.class);

		System.out.println("Output from Server .... \n");
		System.out.println(outputArticle);
                ObjectMapper mapper = new ObjectMapper();
                Articles articles = mapper.readValue(outputArticle, Articles.class);
                System.out.println("Status:" + articles.getStatus());
                for(Article a: articles.getArticles()) {
                    System.out.println("Authors:" + a.getAuthor());
                    System.out.println("Title:" + a.getTitle());
                    System.out.println("Description:" + a.getDescription());
                    System.out.println("Url:" + a.getUrl());
                    System.out.println();
                }
                System.out.println();
                
                Client clientNews = Client.create();

		WebResource webResourceNews = clientNews
		   .resource("https://newsapi.org/v1/sources?language=en");

		ClientResponse responseNews = webResourceNews.accept("application/json")
                   .get(ClientResponse.class);

		if (responseNews.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ responseNews.getStatus());
		}

		String outputNews = responseNews.getEntity(String.class);

		System.out.println("Output from Server .... \n");
		System.out.println(outputNews);
                ObjectMapper mapperNews = new ObjectMapper();
                News news = mapperNews.readValue(outputNews, News.class);
                System.out.println("Status:" + news.getStatus());
                for(NewOne a: news.getSources()) {
                    System.out.println("Name:" + a.getName());
                    System.out.println("Country:" + a.getCountry());
                    System.out.println("Category:" + a.getCategory());
                    System.out.println("Description:" + a.getDescription());
                    System.out.println("Url:" + a.getUrl());
                    System.out.println();
                }
                System.out.println();

	  } catch (Exception e) {

		e.printStackTrace();
	  }
	}
}
