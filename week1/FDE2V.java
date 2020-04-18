import java.util.Scanner;
public class FDE2V{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a11: ");
        Float a11 = in.nextFloat();

        System.out.println("Enter a12: ");
        Float a12 = in.nextFloat();
        
        System.out.println("Enter a21: ");
        Float a21 = in.nextFloat();

        System.out.println("Enter a22: ");
        Float a22 = in.nextFloat();

        System.out.println("Enter b1: ");
        Float b1 = in.nextFloat();

        System.out.println("Enter b2: ");
        Float b2 = in.nextFloat();

        System.out.println("The first-degree equation with 2 variables x1, x2: ");
        System.out.println(a11+"*x1+"+a12+"*x2="+b1);
        System.out.println(a21+"*x1+"+a22+"*x2="+b2);
       
        float D = a11*a22-a21*a12;
        float D1 = b1*a22-b2*a12;
        float D2 = a11*b2-a21*b1;

        if(D==0){
            if(D1==0 && D2==0){
                System.out.println("The system has infinitely many solutions");
            }
            else{
                System.out.println("The system has no solution");
            }
        }
        else{
            float x1 = D1/D;
            float x2 = D2/D;
            System.out.println("Solution: x1="+x1+"\t x2="+x2);
        }

    }
}