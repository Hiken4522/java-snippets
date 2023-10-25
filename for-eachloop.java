import java.util.*;

public class App{
    public static void main(String[] args){

        String numbers[] = new String[3];
        numbers[0] = "hello";
        numbers[1] = "wassup";
        numbers[2] = "gooys";

        for(String i : numbers){
            System.out.println(i);
        }

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);

        for(Integer i : num){
            System.out.println(i);
        }


    }
}
