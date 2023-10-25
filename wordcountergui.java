import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"Welcome to the word counter program");

        String s  = JOptionPane.showInputDialog("Input the required string");
        String spli[] = s.split(" ");
        ArrayList<String> spl = new ArrayList<String>(Arrays.asList(spli));
        int a = spl.size();

        JOptionPane.showMessageDialog(null, "The number of words in the entered string is: "+a);
       
    }
}
