/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcuoiki;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author DUC
 */
public class Connect {
        public Connection getConnection(){
           Connection conn = null;
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433;databaseName=A");
                if(conn != null){
                    System.out.println("Ket Noi Thanh Cong");
                }


            } catch (Exception ex) {
                System.out.println(ex.toString());
            
        }
        return conn;
    }
    
    
}
