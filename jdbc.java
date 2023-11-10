import java.sql.*;

public class App{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/money";
        String uname = "root";
        String pwd = "1234";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);

        String query = "create table manage(description varchar(255),price varchar(255))";

        Statement st = con.createStatement();
        st.executeUpdate(query);
        
    }
}
