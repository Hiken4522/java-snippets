import java.util.Scanner;

public class App{

    public static void ng(){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100*Math.random());

        System.out.println("A number has been chosen between 1 and 100");

        int k = 5;
        int guess;

        System.out.println("you have 5 tries to guess the number right");

        for(int i = 0;i<k;i++){

            System.out.println("Enter your guess: ");
            guess = sc.nextInt();

            if(number == guess){
                System.out.println("You have guessed the number correctly!!!");
                break;
            }

            else if(number>guess ){
                System.out.println("The nuumber that you have guessed is larger than the number chosen");
            }

            else if (number < guess ){
                System.out.println("The number that you have guessed is smaller than the number chosen");
            }

            if (i == k-1){
                System.out.println("You have exhauseted the number of chances you had!");
                
                System.out.println("The number was " + number);

            }
        }
        sc.close();
    }


    public static void main(String[] args){
        ng();
    }
}
