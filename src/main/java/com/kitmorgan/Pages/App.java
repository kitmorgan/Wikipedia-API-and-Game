package com.kitmorgan.Pages;

import com.kitmorgan.Pages.model.Article;
import com.kitmorgan.Pages.model.Page;
import com.kitmorgan.Pages.services.ConsoleService;
import com.kitmorgan.Pages.services.PageService;

import java.util.List;

public class App {
    private final PageService pageService = new PageService();
    private final ConsoleService consoleService = new ConsoleService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    private void run(){
        int menuSelection = -99;
        while (menuSelection!=0){
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection("Chose an option: ");
            if(menuSelection == 1){
                handleListPages();
            }
            consoleService.pause();
        }
    }

    private void handleListPages(){

        Article[] articles = pageService.listTopPages(consoleService.getDate());
        consoleService.printPages(articles);
    }

}
