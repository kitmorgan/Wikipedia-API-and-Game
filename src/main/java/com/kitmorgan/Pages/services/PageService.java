package com.kitmorgan.Pages.services;

import com.kitmorgan.Pages.model.Article;
import com.kitmorgan.Pages.model.Page;
import com.kitmorgan.Pages.model.WikipediaBase;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import com.kitmorgan.util.BasicLogger;

import java.util.ArrayList;
import java.util.List;

public class PageService {

    private static final String API_TOP_URL = "https://wikimedia.org/api/rest_v1/metrics/pageviews/top/en.wikipedia/all-access/";
    private static final String API_PAGE_URL_START = "https://en.wikipedia.org/w/api.php?action=parse&format=json&page=";
    private static final String API_PAGE_URL_END = "&prop=wikitext&formatversion=2";
    private final RestTemplate restTemplate = new RestTemplate();
    private WikipediaBase base;


    public Article[] listTopPages(String date){

        try{base = restTemplate.getForObject(API_TOP_URL + date, WikipediaBase.class);
        } catch (RestClientResponseException | ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
            return null;
        }
        return base.getItem()[0].getArticles();
    }

    public List<Page> listTopPagesByDate(String yyyymmdd){
        List<Page> pages = new ArrayList<>();
        try{
            pages.add(restTemplate.getForObject(API_TOP_URL + yyyymmdd,Page.class));
        } catch (RestClientResponseException | ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return pages;
    }
    public Page getPage(String title){
        Page page = null;
        try{
            page = restTemplate.getForObject(API_PAGE_URL_START + title + API_PAGE_URL_END, Page.class);
        } catch (RestClientResponseException | ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return page;
    }
}
