package EnumWeekdays;

import Weekdays.Weekdays;

public class Main {
    public static void main(String[] args) {
        for (Weekdays w:
             Weekdays.values()) {
            System.out.println(w.plan());
        }
    }
}