package com.app.connection;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Aashish
 */
public class DbConnection {

    public static Connection connectdb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor_project", "root", "root");
//            con = DriverManager.getConnection("jdbc:sqlite:C:\\logistic\\logistic.sqlite");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Some thing happend wrog please contact to technicle team !!");
        }
        return con;
    }
}
