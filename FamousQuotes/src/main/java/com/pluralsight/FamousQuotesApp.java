package com.pluralsight;

import java.util.Scanner;

public class FamousQuotesApp {

    static Scanner genaQuotes = new Scanner(System.in);

    public static void main(String[] args) {

    //create an array to store 10 strings
    String[] quotes = {
            "You only lose when you give up",
            "Save Money.Live Better",
            "Dress For Less",
            "Dream big. Start Small",
            "Failure is a stepping stone to success",
            "You are enough",
            "Stay Hungry. Stay Foolish",
            "Love Yourz",
            "Progress is the enemy of failure",
            "Less is more"
    };

    boolean keepGoing = true;


    while (keepGoing){
        try {
            //Prompt the user to select a number
            System.out.println("Please choose a number between 1-10:" );
            int choice = Integer.parseInt(genaQuotes.nextLine());

            //display the user choice;
          //  System.out.println(quotes[choice - 1]);
            if (choice >= 1 && choice <= 10){
                System.out.println("Your quote: " + quotes[choice - 1]);
            }else {
                System.out.println("Number must between 1 and 10.");
            }
        } catch (Exception e) {
            System.out.println("You have made an invalid option, please select again");
        }


        System.out.println("Do you want to choose another quote? (y/n)");
        String userAnswer = genaQuotes.nextLine();

        if (!userAnswer.equals("y")){
            keepGoing = false;
            System.out.println("Thank you for checking out the quotes.");
        }
    }

    }




}
