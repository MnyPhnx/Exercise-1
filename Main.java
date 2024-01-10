import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a short date (YYYY-MM-DD): ");
    String shortDate = scanner.next();
    String[] dateArray = shortDate.split("-");
    int year = Integer.parseInt(dateArray[0]);
    int month = Integer.parseInt(dateArray[1]);
    int day = Integer.parseInt(dateArray[2]);

    String monthName = "";
    switch (month) {
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      case 3:
        monthName = "March";
        break;
      case 4:
        monthName = "April";
        break;
      case 5:
        monthName = "May";
        break;
      case 6:
        monthName = "June";
        break;
      case 7:
        monthName = "July";
        break;
      case 8:
        monthName = "August";
        break;
      case 9:
        monthName = "September";
        break;
      case 10:
        monthName = "October";
        break;
      case 11:
        monthName = "November";
        break;
      case 12:
        monthName = "December";
        break;
      default:
        monthName = "Invalid month";
        break;
    }

    String fullDate = monthName + " " + day + ", " + year;
    System.out.println(fullDate);
  }
}
