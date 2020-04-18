package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
    public static void main(String[] args) {
        MyDate dateList[] = new MyDate[4];

        dateList[0] = new MyDate("first", "january", "twenty twenty");
        dateList[1] = new MyDate(16, 5, 2019);
        dateList[2] = new MyDate(23, 10, 2018);
        dateList[3] = new MyDate(27, 8, 2020);

        DateUtils.sortDates(dateList);

        for(int i = 0; i < dateList.length; i++)
            dateList[i].print();

    }
}