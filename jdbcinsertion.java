import java.sql.*;
import java.util.Scanner;



public class App{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/money";
        String uname = "root";
        String pwd = "1234";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);

        
        String q1 = "insert into manage(description,price)"+"values(?,?)";

        PreparedStatement pt = con.prepareStatement(q1);
        System.out.println("enter the description");
        String desc = sc.nextLine();
        System.out.println("enter the price");
        String pri = sc.nextLine();
        pt.setString(1, desc);
        pt.setString(2, pri);
        pt.executeUpdate();
        sc.close();

        
    }
}
