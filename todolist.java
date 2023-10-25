import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App1 {

    public static void main(String[] args){

        ArrayList<ArrayList<String>> fin = new ArrayList<>();

        JOptionPane.showMessageDialog(null,"Welcome to to do task list");
        JOptionPane.showMessageDialog(null,"What would you like to do?");

        String a = JOptionPane.showInputDialog("1.Add \n2.View Tasks \n3.Delete Task");
        String b = a.toLowerCase();
        switch (b){
            case "add":
                String inp = JOptionPane.showInputDialog("Enter the task and its description separated by ':' ");
                String spli[] = inp.split(":");
                ArrayList<String> td = new ArrayList<String>(Arrays.asList(spli));               
                fin.add(td);
                break;
            case "view":
                for(int i = 0;i<fin.size();i++){
                    JOptionPane.showMessageDialog(null, fin.get(i));                    
                }
        }
        String ap = JOptionPane.showInputDialog("would you like to continue?");
        ap.toLowerCase();
        while(ap.equalsIgnoreCase("yes")){
            a = JOptionPane.showInputDialog("1.Add \n2.View Tasks \n3.Delete Task");
            b = a.toLowerCase();
            switch (b){
                case "add":
                    String inp = JOptionPane.showInputDialog("Enter the task and its description separated by ':' ");
                    String spli[] = inp.split(":");
                    ArrayList<String> td = new ArrayList<String>(Arrays.asList(spli));               
                    fin.add(td);
                    break;
                case "view":
                    for(int i = 0;i<fin.size();i++){
                        JOptionPane.showMessageDialog(null, fin.get(i));                    
                    }
            }
            ap = JOptionPane.showInputDialog("would you like to continue?");
            ap.toLowerCase();

        }


    }

    
}
