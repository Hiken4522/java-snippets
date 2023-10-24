import java.util.Random;

public class App{
    public static void main(String[] args){
        Random sc = new Random();

        int x = sc.nextInt(6)+1;//random number between 1 and 6
        double y = sc.nextDouble();
        boolean z = sc.nextBoolean();
        
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
