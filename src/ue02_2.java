import libraries.In;
import libraries.Out;

public class ue02_2 {
    private static boolean leapYear(int year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Out.println("Please write down the year");
        int year = In.readInt();

        Out.println("Please write down the month(1-12)");
        int month = In.readInt();

        int days;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;

            case 2:
                if (leapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }

                break;
            default:
                Out.println("Something is wrong here, please write down the correct month");
                return;
        }
        Out.println("" + month + "." + year + " has " + days + " days");
    }

}
