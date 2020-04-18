import java.util.Scanner;
public class FirstDegreeEquation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        Float a = in.nextFloat();

        System.out.println("Enter b: ");
        Float b = in.nextFloat();
        Float x = -b/a;
        System.out.println("The first-degree equation: "+a+"*x+"+b+"=0");
        System.out.println("=>x="+x);
    }
}