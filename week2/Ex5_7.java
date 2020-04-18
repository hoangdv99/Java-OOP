import java.util.Scanner;

public class Ex5_7 {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		do{
			System.out.print("Nhap so chieu: ");
			n = sc.nextInt();
		}while(n<0);
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		System.out.println("Ma tran A:");
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Ma tran B:");
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				b[i][j]= sc.nextInt();
			}
		}
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				c[i][j]= a[i][j]+b[i][j];
			}
		}
		System.out.println("Ma tran C:");
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}