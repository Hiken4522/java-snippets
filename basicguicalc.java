import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to the basic GUI calc");
        int re;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the num1"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the num2"));

        JOptionPane.showMessageDialog(null,"Enter the operator");

        String a = JOptionPane.showInputDialog("Available operators are +, -, x, /");


        switch (a){
            case "+":
                re = num1+num1;
                JOptionPane.showMessageDialog(null,num1+" + "+num2+" = "+re);
                break;
            case "-":
                re = num1-num1;
                JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+re);
                break;
            case "x":
                re = num1*num1;
                JOptionPane.showMessageDialog(null,num1+" x "+num2+" = "+re);
                break;
            case "/":
                re = num1/num1;
                JOptionPane.showMessageDialog(null,num1+" / "+num2+" = "+re);
                break;

        }

    }
}
