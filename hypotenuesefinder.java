import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x,y,z;

        System.out.println("Enter the side x: ");
        x = sc.nextDouble();
        System.out.println("Enter the side y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypoteneuse is "+z);

        sc.close();

    }
}
