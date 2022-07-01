package com.kitmorgan.Pages.services;

import com.kitmorgan.Pages.model.Article;
import com.kitmorgan.Pages.model.Page;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }
    public void printMainMenu() {
        System.out.println();
        System.out.println("----Kit's Wikipedia Client----");
        System.out.println("1: List Top Pages");
        System.out.println("2: Show Content of a Specific Page");
        System.out.println("3: Play a guessing game");
        System.out.println("0: Exit");
        System.out.println();
    }

    public void printPages(Article[] articles) {
        NumberFormatter formatter = new NumberFormatter();
        System.out.println("--------------------------------------------");
        System.out.println("Articles");
        System.out.println("'Title' (views)");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println(i+1 + ". " + articles[i].getTitle() + " (" + formatter.valueToString(articles[i].getViews()) +")");
            }catch (Exception e){
                System.out.println("Skipped");
            }
        }
    }

    public void pause(){
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    public String getDate(){
        String date;
        while (true) {
            System.out.printf("Enter a date (YYYY/MM/DD, or press enter to search most recent:");
            date = scanner.nextLine();
            if (date.matches("\\d{4}/\\d{2}/\\d{2}")) {
                return date;
            }else if(date.equals("")){
                return "2022/04/01";
            }

        }
    }

    public void notFound(){
        System.out.println("Not found");
    }

}
