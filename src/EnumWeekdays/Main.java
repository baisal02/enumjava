package EnumWeekdays;

import Weekdays.Weekdays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day.toUpperCase()) {
            case "MONDAY" -> System.out.println(Weekdays.MONDAY.plan());
            case "TUESDAY" -> System.out.println(Weekdays.TUESDAY.plan());
            case "WEDNSDAY" -> System.out.println(Weekdays.WEDNSDAY.plan());
            case "THURSDAY" -> System.out.println(Weekdays.THURSDAY.plan());
            case "FRIDAY" -> System.out.println(Weekdays.FRIDAY.plan());
            case "SATURDAY" -> System.out.println(Weekdays.SATURDAY.plan());
            case "SUNDAY" -> System.out.println(Weekdays.SUNDAY.plan());
            default -> System.out.println("-------");
        }
    }
}