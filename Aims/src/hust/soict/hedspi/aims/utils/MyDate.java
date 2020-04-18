package hust.soict.hedspi.aims.utils;
import java.util.Scanner;
import java.time.LocalDateTime;

public class MyDate {

	public MyDate() {
		super();
		LocalDateTime now = LocalDateTime.now();
		this.day = now.getDayOfMonth();
		this.month = now.getMonthValue();
		this.year = now.getYear();
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate(String day, String month, String year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public MyDate(String stringDate) { // eg: February 18th 2019
		super();
		String[] dateArray = stringDate.split(" ");
		switch (dateArray[0]) {
			case "January": {
				this.month = 1;
				break;
			}
			case "February": {
				this.month = 2;
				break;
			}
			case "March": {
				this.month = 3;
				break;
			}
			case "April": {
				this.month = 4;
				break;
			}
			case "May": {
				this.month = 5;
				break;
			}
			case "June": {
				this.month = 6;
				break;
			}
			case "July": {
				this.month = 7;
				break;
			}
			case "August": {
				this.month = 8;
				break;
			}
			case "September": {
				this.month = 9;
				break;
			}
			case "October": {
				this.month = 10;
				break;
			}
			case "November": {
				this.month = 11;
				break;
			}
			case "December": {
				this.month = 12;
				break;
			}
			default:
				break;
		}

		this.day = Integer.parseInt(dateArray[1].substring(0, 2));
		this.year = Integer.parseInt(dateArray[2]);
	}

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void print() {
		System.out.print("The date: ");
		System.out.println(this.day + "-" + this.month + "-" + this.year);

	}

	public void accept() {
		String mydate;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap MyDate(eg January 01st 2020): ");
		mydate = sc.nextLine();
		String[] output = mydate.split(" ");
		year = Integer.parseInt(output[2]);
		day = Integer.parseInt(output[1].substring(0, 2));

		switch (output[0]) {
			case "January": {
				month = 1;
				break;
			}
			case "February": {
				month = 2;
				break;
			}
			case "March": {
				month = 3;
				break;
			}
			case "April": {
				month = 4;
				break;
			}
			case "May": {
				month = 5;
				break;
			}
			case "June": {
				month = 6;
				break;
			}
			case "July": {
				month = 7;
				break;
			}
			case "August": {
				month = 8;
				break;
			}
			case "September": {
				month = 9;
				break;
			}
			case "October": {
				month = 10;
				break;
			}
			case "November": {
				month = 11;
				break;
			}
			case "December": {
				month = 12;
				break;
			}
			default: {
				System.out.println("Nhap sai thang r");
				System.exit(-1);
			}
		}
		sc.close();
	}
	public void setDay(String day){
        if((day.toLowerCase()).equals("first"))
            this.day = 1;
        if((day.toLowerCase()).equals("second"))
            this.day = 2;
        if((day.toLowerCase()).equals("third"))
            this.day = 3;
        if((day.toLowerCase()).equals("fourth"))
            this.day = 4;
        if((day.toLowerCase()).equals("fifth"))
            this.day = 5;
        if((day.toLowerCase()).equals("sixth"))
            this.day = 6;
        if((day.toLowerCase()).equals("seventh"))
            this.day = 7;
        if((day.toLowerCase()).equals("eighth"))
            this.day = 8;
        if((day.toLowerCase()).equals("ninth"))
            this.day = 9;
        if((day.toLowerCase()).equals("tenth"))
            this.day = 10;
        if((day.toLowerCase()).equals("eleventh"))
            this.day = 11;
        if((day.toLowerCase()).equals("twelve"))
            this.day = 12;
        if((day.toLowerCase()).equals("thirteenth"))
            this.day = 13;
        if((day.toLowerCase()).equals("fourteenth"))
            this.day = 14;
        if((day.toLowerCase()).equals("fifteenth"))
            this.day = 15;
        if((day.toLowerCase()).equals("sixteenth"))
            this.day = 16;
        if((day.toLowerCase()).equals("seventeenth"))
            this.day = 17;
        if((day.toLowerCase()).equals("eighteenth"))
            this.day = 18;
        if((day.toLowerCase()).equals("nineteenth"))
            this.day = 19;
        if((day.toLowerCase()).equals("twentyth"))
            this.day = 20;
        if((day.toLowerCase()).equals("twenty-first"))
            this.day = 21;
        if((day.toLowerCase()).equals("twenty-second"))
            this.day = 22;
        if((day.toLowerCase()).equals("twenty-third"))
            this.day = 23;
        if((day.toLowerCase()).equals("twenty-fourth"))
            this.day = 24;
        if((day.toLowerCase()).equals("twenty-fifth"))
            this.day = 25;
        if((day.toLowerCase()).equals("twenty-sixth"))
            this.day = 26;
        if((day.toLowerCase()).equals("twenty-seventh"))
            this.day = 27;
        if((day.toLowerCase()).equals("twenty-eighth"))
            this.day = 28;
        if((day.toLowerCase()).equals("twenty-ninth"))
            this.day = 29;
        if((day.toLowerCase()).equals("thirtieth"))
            this.day = 30;
        if((day.toLowerCase()).equals("thirty-first"))
            this.day = 31;
	}
	public void setMonth(String month){
        switch (month.toLowerCase()){
            case "january":
                this.month = 1;
                break;

            case "february":
                this.month = 2;
                break;

            case "march":
                this.month = 3;
                break;

            case "april":
                this.month = 4;
                break;

            case "may":
                this.month = 5;
                break;

            case "june":
                this.month = 6;
                break;

            case "july":
                this.month = 7;
                break;

            case "august":
                this.month = 8;
                break;

            case "september":
                this.month = 9;
                break;

            case "october":
                this.month = 10;
                break;

            case "november":
                this.month = 11;
                break;

            case "december":
                this.month = 12;
                break;

            default:
                break;
        }
	}
	public void setYear(String year) {
        switch (year.toLowerCase()) {
            case "twenty twenty":
                this.year = 2020;
                break;

            case "twenty nineteen":
                this.year = 2019;
                break;

            case "twenty eighteen":
                this.year = 2018;
                break;

            case "twenty seventeen":
                this.year = 2017;
                break;

            case "twenty sixteen":
                this.year = 2016;
                break;

            case "twenty fifteen":
                this.year = 2015;
                break;

            default:
                break;
        }
    }
}
