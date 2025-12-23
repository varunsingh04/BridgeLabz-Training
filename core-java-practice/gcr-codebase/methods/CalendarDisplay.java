import java.util.Scanner;

public class CalendarDisplay {

    //Method to Get the month Taking integer user input of month and return a string of month
    public static String getMonthName(int month) {

        //String Array of months
        String[] months = {"January", "February", "March", "April", "May", "June", 
                          "July", "August", "September", "October", "November", "December"};
        return months[month - 1]; //returning a months in string doing month-1 is because user input is in integer and Array start at index 0
    }


    //Method to Check that User input year is a leap year or not 
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Method to calculate a number of days in a month
    public static int getDaysInMonth(int month, int year) {

        //Declaring an array according to months no. of days
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //condiition if year is leap year and month is Feb i.e 2 then no. of day si 29
        if (month == 2 && isLeapYear(year)) return 29;

        //return a result 
        return days[month - 1];
    }

    //Method to find first day of month

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    //Method to display calendar
    public static void displayCalendar(int month, int year) {
        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();//User input of month in integer value
        int year = input.nextInt();//User input of year

        //Calling a static function
        displayCalendar(month, year);
        input.close();
    }
}