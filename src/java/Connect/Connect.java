/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TuanDuc
 */
public class Connect {
    public Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PS10576_QLDienThoai";
            return DriverManager.getConnection(url, "sa", "");
        } catch (Exception e) {}
        return null;
    }
}
