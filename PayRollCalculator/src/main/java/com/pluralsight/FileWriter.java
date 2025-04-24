package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) {

        Scanner files = new Scanner(System.in);

        try {
            //prompt the user to enter the input file name
            System.out.println("Enter the name of the file to process: ");
            String fileName = files.nextLine();

            //prompt the user to enter the output file name
            System.out.println("Enter the name of the payroll file to create: ");
            String outputFile = files.nextLine();

            FileReader theFile = new FileReader("src/main/resources/" + fileName);
            BufferedReader myBufferedReader = new BufferedReader(theFile);

            java.io.FileWriter fileWriter2 = new java.io.FileWriter("src/main/resources/");

        }


    }




}
