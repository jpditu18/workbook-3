import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {

        //prompt the menu to display current date and time within the correct format
        System.out.println("What is current date and time");
        LocalDate currentDate = LocalDate.now();
        LocalTime CurrentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        //apply formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");


        //display the formats
        System.out.println("Today is: ");
        System.out.println(currentDateTime.format(formatter1) + "\n");
        System.out.println("Today is: ");
        System.out.println(currentDateTime.format(formatter2) + "\n");
        System.out.println("Today is: ");
        System.out.println(currentDateTime.format(formatter3) + "\n");
        System.out.println("Today is: ");
        System.out.println(currentDateTime.format(formatter4) + "\n");
        System.out.println("The time is: ");
        System.out.println(currentDateTime.format(formatter5));


    }
}
