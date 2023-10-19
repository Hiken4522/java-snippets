import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to enter: ");
        int a = sc.nextInt();
        sc.nextLine(); 
        String as[] = new String[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter your value: ");
            String af = sc.nextLine();
            as[i] = af;
        }

        System.out.println("Enter the value that you want to search for: ");
        String s = sc.nextLine();

        Arrays.sort(as); // It's important to sort the array before using binarySearch.

        int indexof = Arrays.binarySearch(as, s);

        if (indexof < 0) {
            System.out.println(s + " is not found in the list");
        } else {
            System.out.println(s + " is found at index " + indexof);
        }

        sc.close();
    }
}
