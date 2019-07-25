/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parminder
 */
import java.sql.*;
public class JavaConnect {
     public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql:///libmanagement";
            conn = DriverManager.getConnection(url, "root", "qwerty");

        } catch (Exception e) {
            System.out.println("Exception in connect()" + e);
        }
        return conn;
    }   
}
