package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStoriesApp {

    static Scanner myStories = new Scanner(System.in);

    public static void main(String[] args) {

        try{

            System.out.println("Enter the name of a story:");
            String storyChoice = myStories.nextLine();

            FileInputStream fis = new FileInputStream("src/main/resources/" + storyChoice);
            Scanner fileScanner = new Scanner(fis);

            int lineNumber = 1;
            while(fileScanner.hasNextLine()){
                System.out.println(lineNumber + ": " + fileScanner.nextLine());
                lineNumber++;
            }


        } catch (Exception e) {
            System.out.println("Story Doesn't exist");
        }
    }



}
