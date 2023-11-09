import java.util.Scanner;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String p = "";
        System.out.println("enter the string");
        s = sc.nextLine();
        String st[] = s.split(""); 
        int l = st.length;
        ArrayList<String> sr = new ArrayList<String>();
        for(int i = l-1; i>= 0 ;i--){
            sr.add(st[i]);
        }
        for(String c: sr){
            p += c;
        }

        System.out.println("What would you like to do now?\n\n");
        System.out.println("1.View Reversed String \n2.Check for palindrome");
        int op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("The reversed string is - "+p);
                break;
            case 2:
                System.out.println("Checking for palindrome......");
                if(s.equals(p)){
                    System.out.println(s+" is a palindrome");
                }
                else{
                    System.out.println(s+" is not a palindrome");
                }
                break;
        }
        sc.close();

    }
}
