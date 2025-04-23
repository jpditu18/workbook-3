package com.pluralsight;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

public class BedtimeStoriesApp {

    static Scanner myStories = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepReading = true;

        while (keepReading){
            try{

                System.out.println("Enter the name of a story:");
                String storyChoice = myStories.nextLine();

                FileInputStream fis = new FileInputStream("src/main/resources/" + storyChoice);
                Scanner fileScanner = new Scanner(fis);

                int lineNumber = 1;
                System.out.println("You are reading: " + storyChoice + "\":\n");
                while(fileScanner.hasNextLine()){
                    System.out.println(lineNumber + ": " + fileScanner.nextLine());
                    lineNumber++;
                }

            } catch (Exception e) {
                System.out.println("Story Doesn't exist");

            }
            System.out.println("\nWould you like to read another story? (y/n): ");
            String answer = myStories.nextLine().trim().toLowerCase();

            if (!answer.equals("y")){
                keepReading = false;
                System.out.println("Thank You for reading. Have a nice day!");
        }

        }
    }



}
