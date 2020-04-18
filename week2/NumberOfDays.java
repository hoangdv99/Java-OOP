
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfDays {
	public static boolean checkYear(int year){
		if(year%400==0) return true;
		if(year%4==0 && year %100!=0) return true;
		return false;
	}
	public static void main(String[] args) {
        String[] list = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Jan.", "Feb.", "Mar.", "Apr.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int year;
        String month;
        boolean contains;
		Scanner sc = new Scanner(System.in);
		do{
			String input;
			System.out.print("Year/Month: ");
			input = sc.nextLine();
			String[] output= input.split("/");
			year = Integer.parseInt(output[0]);
            month = output[1];
            contains =  Arrays.stream(list).anyMatch(month::equals);
		}while(year < 0 || contains == false);
		System.out.print("Number days of month "+month+" year "+year+" : ");
		switch(month){
        case "1": case "3": case "5": case "7": case "8": case "10": case "12":
        case "January": case "March": case "May": case "July": case "August": case"October": case "December":
        case "Jan": case "Mar": case "Jul": case "Aug": case "Oct": case "Dec":
        case "Jan.": case "Mar.": case "Aug.": case "Oct.": case "Dec.":
        {
			System.out.println("31");
			break;
		}
        case "4": case "6": case "9": case "11":
        case "April": case "June": case "September": case "November":
        case "Apr": case "Sep": case "Nov":
        case "Apr.": case "Sep.": case "Nov.":
        {
            System.out.println("30");
            break;
		}
        case "2": case "February": case "Feb": case "Feb.":
        {
			if(checkYear(year)){
				System.out.println("29");
			}else{
				System.out.println("28");
            }
            break;
		}
		
		}
		sc.close();
	}
}