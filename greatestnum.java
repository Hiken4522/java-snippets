import java.util.Arrays;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nos[] = new int[5];

        for(int i = 0; i<5 ; i++){
            System.out.println("Enter the number: ");
            int a = sc.nextInt();
            nos[i] = a;
        }

        Arrays.sort(nos);

        System.out.println("The largest number is: " + nos[4]);

        sc.close();


    }
}
