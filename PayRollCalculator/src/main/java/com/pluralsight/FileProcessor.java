package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileProcessor {
    public static void main(String[] args) {

        Scanner files = new Scanner(System.in);

        try {
            //establish the input and output file names
            String fileName = "inventory.csv";
            String outputFile1 = "output1.txt";
            String outputFile2 = "output2.txt";

            //open the input file for reading
            FileReader fileReader = new FileReader("src/main/resources/" + fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //open the first output fill name
            FileWriter writer1 = new FileWriter("src/main/resources/" + outputFile1);
            BufferedWriter bufferedWriter1 = new BufferedWriter(writer1);

            FileWriter writer2 = new FileWriter("src/main/resources/" + outputFile2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

            //read and process each line from the input file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //Split the line into 2 parts using the "|" character
                String[] parts = line.split("\\|");

                //convert into proper data types
                int productID = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                Product product = new Product(productID, name, price);

                // Print out the product details to the console
                System.out.printf("Product ID: %d, Name: %s, Price: $%.2f\n",
                        product.getProductId(), product.getName(), product.getPrice());

                // Format the output line for the files
                String outputLine = product.getProductId() + ", " + product.getName() + ", " + product.getPrice() + "\n";

                // Write the line to both output files
                bufferedWriter1.write(outputLine);
                bufferedWriter2.write(outputLine);
            }

            bufferedWriter1.close();
            bufferedWriter2.close();
            bufferedReader.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }




}
