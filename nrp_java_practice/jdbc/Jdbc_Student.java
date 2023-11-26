package nrp_java_practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Student {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        //1.register the driver 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        
        //2.creating the connection
        Connection connection=DriverManager.getConnection("jdbc:derby:StudentDataBase;create=true");
        System.out.println("conection open and close");
    }
   
}
