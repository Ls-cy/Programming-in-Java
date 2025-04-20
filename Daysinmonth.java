import java.util.*;

public class Daysinmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for month and year
        System.out.print("Enter the month number (1–12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        String monthName = "";
        int days = 0;

        switch (month) {
            case 1:  monthName = "January"; days = 31; break;
            case 2:  monthName = "February";
                     // Check for leap year
                     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                         days = 29;
                     } else {
                         days = 28;
                     }
                     break;
            case 3:  monthName = "March"; days = 31; break;
            case 4:  monthName = "April"; days = 30; break;
            case 5:  monthName = "May"; days = 31; break;
            case 6:  monthName = "June"; days = 30; break;
            case 7:  monthName = "July"; days = 31; break;
            case 8:  monthName = "August"; days = 31; break;
            case 9:  monthName = "September"; days = 30; break;
            case 10: monthName = "October"; days = 31; break;
            case 11: monthName = "November"; days = 30; break;
            case 12: monthName = "December"; days = 31; break;
            default:
                System.out.println("Invalid month. Please enter a value from 1 to 12.");
                input.close();  
                return;
        }
        
        System.out.println(monthName + " " + year + " has " + days + " days.");

            input.close(); 
        }
    }
