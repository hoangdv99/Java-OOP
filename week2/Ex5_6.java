import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5_6 {
	public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int choice;
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
            System.out.println("Them vao chuoi: ");
            System.out.println("1. Co ");
            System.out.println("2. Khong ");
            System.out.println("Lua chon:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    int number = sc.nextInt();
                    array.add(number);
                    break;
                case 2:
                    break;
                default:
                    break;
            }
    
        }while(choice != 2);
		for(Integer i: array){
			sum+=i;
		}
		float avg = sum/(float)array.size();
		Collections.sort(array);
		System.out.println("Sum : "+sum+" Avg: "+avg);
		for(Integer i: array){
			System.out.print(i+" ");
		}
	}
}