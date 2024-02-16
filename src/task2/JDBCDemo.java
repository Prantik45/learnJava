package task2;

import java.sql.*;

/*
1. import the package --> java.sql
2. load and register the driver --> various drivers for various services -- (MySQL Driver) com.mysql.jdbc.Driver
3. Create the connection --> Connection interface
4. Create a statement --> Statement interface
5. Execute the query
6. process the results
7. close
*/

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306//test_gensys1";
        String uname = "root";
        String pass = "parrot@patTnsnd_0428";
        String query = "SELECT * FROM employee";

        try {
            //forName --> method to load the class
            Class.forName("com.mysql.cj.jdbc.Driver");  //check for reference Class.forName
            Connection connection = DriverManager.getConnection(url, uname, pass);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }
}
