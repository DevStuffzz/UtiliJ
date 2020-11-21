package utilij.time;

public class TimeTools {
    public static int maxMonthDays(Month month) {
        int maxDay = 0;
        switch (month) {
            case January:
                maxDay = 31;
                break;
            case February:
                maxDay = 28;
                break;
            case March:
                maxDay = 31;
                break;
            case April:
                maxDay = 30;
                break;
            case May:
                maxDay = 31;
                break;
            case June:
                maxDay = 30;
                break;
            case July:
                maxDay = 31;
                break;
            case August:
                maxDay = 31;
                break;
            case September:
                maxDay = 30;
                break;
            case October:
                maxDay = 31;
                break;
            case November:
                maxDay = 31;
                break;
            case December:
                maxDay = 31;
                break;
        }
        return maxDay;
    }

    public static final boolean MMDDYY = false;
    public static final boolean DDMMYY = true;

    public static int MinsToSecs(int mins) {
        return mins * 60;
    }
    public static int HoursToSecs(int hours) {
        return hours * (60 * 60);
    }
    public static int YearsToDays(int years) {
        return years * 365;
    }
}
