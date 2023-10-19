import java.util.Scanner;

public class App{

    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        a = sc.nextInt();

        System.out.println("Enter the number2: ");
        b = sc.nextInt();

        

        System.out.println("Enter the operation that you want to perform: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division ");
        c = sc.nextInt();

        switch(c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;

        }

        sc.close();

    }

}
