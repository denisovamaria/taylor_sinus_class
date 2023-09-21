import java.util.Scanner;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("Enter k");
        int k = in.nextInt();
        double eps = 1 / Math.pow(10, k);
        Sinus_taylor a = new Sinus_taylor();
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        System.out.println("Taylor's sinus:");
        System.out.println(formatter.format(a.getSinus(x,eps)));
        System.out.println("Sinus with library 'Math':");
        System.out.println(formatter.format(Math.sin(x) / x));
    }
}