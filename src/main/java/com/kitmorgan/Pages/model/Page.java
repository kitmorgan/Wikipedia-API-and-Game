package com.kitmorgan.Pages.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {
    private String project;
    @JsonProperty("article")
    private String article;
    private int views;
    private String timestamp;
    private String title;
    @JsonProperty("pageid")
    private String pageId;
    private String content;
    private String wikitext;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWikitext() {
        return wikitext;
    }

    public void setWikitext(String wikitext) {
        this.wikitext = wikitext;
    }

    @Override
    public String toString(){
        return "\n--------------------------------------------" +
                 "\n" + this.getProject() +
                "\n--------------------------------------------" +
                "\n total views: " + this.getViews() +
                "\n timestamp: " + this.getTimestamp();
    }

    public String contentToString(){
        return content;
    }
}
