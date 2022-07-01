package com.kitmorgan.Pages.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WikipediaBase {
    @JsonProperty("items")
    Item[] items;

    public Item[] getItem() {
        return items;
    }

    public void setItem(Item[] items) {
        this.items = items;
    }
}
