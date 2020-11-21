package utilij.time;




import static utilij.time.TimeTools.maxMonthDays;

public class Date {
    private Month month;
    private int day;
    private int year;

    public Date(Month month, int day, int year) {
        this.month = month;

        if(day > maxMonthDays(month)) {
            this.day = maxMonthDays(month);
        }else if(day <= 0){
            this.day = 1;
        }else {
            this.day = day;
        }

        this.year = year;
    }
    public void printDate(DateFormat format) {
        if(!format.format()) {
            System.out.println(day + "/" + monthToInt(month) + "/" + year);
        } else {
            System.out.println(monthToInt(month) + "/" + day + "/" + year);
        }
    }
    public static int monthToInt(Month month) {
        int m = 1;
        switch (month) {
            case January:
                m = 1;
                break;
            case February:
                m = 2;
                break;
            case March:
                m = 3;
                break;
            case April:
                m = 4;
                break;
            case May:
                m = 5;
                break;
            case June:
                m = 6;
                break;
            case July:
                m = 7;
                break;
            case August:
                m = 8;
                break;
            case September:
                m = 9;
                break;
            case October:
                m = 10;
                break;
            case November:
                m = 11;
                break;
            case December:
                m = 12;
                break;
        }
        return m;
    }

    public Month getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
}
