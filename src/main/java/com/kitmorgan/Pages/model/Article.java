package com.kitmorgan.Pages.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Article {
    @JsonProperty("article")
    private String title;
    private int views;
    private int rank;

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Article Details" +
                "\n--------------------------------------------" +
                "\n Title: " + title +
                "\n Rank: " + rank +
                "\n Views: " + views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
