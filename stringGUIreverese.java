import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String p = "";
        s = JOptionPane.showInputDialog("enter the string");
        String st[] = s.split(""); 
        int l = st.length;
        ArrayList<String> sr = new ArrayList<String>();
        for(int i = l-1; i>= 0 ;i--){
            sr.add(st[i]);
        }
        for(String c: sr){
            p += c;
        }

        
        int op = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do now?\n1.View Reversed String \n2.Check for palindrome"));

        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"The reversed string is - "+p);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Checking for palindrome......");
                if(s.equals(p)){
                    JOptionPane.showMessageDialog(null,s+" is a palindrome");
                }
                else{
                    JOptionPane.showMessageDialog(null,s+" is not a palindrome");
                }
                break;
        }
        sc.close();

    }
}
