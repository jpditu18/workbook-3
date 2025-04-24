import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchHistoryApp {
    static DateTimeFormatter timeStampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        //when the app launches, make an entry in the log
        logAction("Launch");

        //create a variable that keep us looping the question for the user
        //until they decide to quit
        boolean keepRunning = true;

        while (keepRunning){

            //display the question to the user
            System.out.println("Enter a search term(X to exit):");
            //store their answer in the variable search term
            String searchTerm = myScanner.nextLine();

            if (searchTerm.equalsIgnoreCase("x")){
                System.out.println("Have a good one ;)!");
                logAction("Exit");
                keepRunning = false;
            }else {
                logAction("Search : " + searchTerm);
            }
        }


    }

    //this is the method that will create and maintain our log file
    public static void logAction(String theAction){

        try {

            //create a file writer and set append to true so it adds to the file
            //and not override its contents
            FileWriter outputFile = new FileWriter("src/main/resources/log.txt",true);
            //create the buffered writer to write to the log file
            BufferedWriter bufWriter = new BufferedWriter(outputFile);

            //create a date and time
            LocalDateTime timeStamp = LocalDateTime.now();
            //create the line to write to the log file by concating the timestamp in the correct format a space and the action
            bufWriter.write(timeStamp.format(timeStampFormatter) + " " + theAction);
            //make sure to have a new line in file
            bufWriter.newLine();
            //close the bufwriter
            bufWriter.close();

        } catch (Exception e) {
            //if we ran into an issue writing to the file, display this message
            System.out.println("Error writing to the file: " + e.getMessage());
        }




    }

}
