package hust.soict.hedspi.aims.utils;

public class DateUtils {

    public static int compareTwoDates(MyDate date1, MyDate date2) {
        if(date1.getYear() > date2.getYear())
            return 1;
        else if (date1.getYear() < date2.getYear())
            return -1;
        else {
            if (date1.getMonth() > date2.getMonth())
                return 1;
            else if (date1.getMonth() < date2.getMonth())
                return -1;
            else if (date1.getDay() > date2.getDay())
                 return 1;
            else if (date1.getDay() < date2.getDay())
                 return -1;
            else
                return 0;
        }
    }

    public static void swap(MyDate date1, MyDate date2){
        MyDate tmp = new MyDate(date1.getDay(), date1.getMonth(), date1.getYear());

        date1.setDay(date2.getDay());
        date1.setMonth(date2.getMonth());
        date1.setYear(date2.getYear());

        date2.setDay(tmp.getDay());
        date2.setMonth(tmp.getMonth());
        date2.setYear(tmp.getYear());
    }

    public static void sortDates(MyDate[] dateList){
        for(int i=0; i<dateList.length-1; i++){
            for(int j=i+1; j<dateList.length; j++){
                if(compareTwoDates(dateList[j], dateList[i]) == 1){
                    swap(dateList[i], dateList[j]);
                }
            }
        }
    }
}