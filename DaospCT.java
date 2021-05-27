/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcuoiki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUC
 */
public class DaospCT {

    private Connection conn;

    public DaospCT() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433;databaseName=A");
            if (conn != null) {
                System.out.println("Ket Noi Thanh Cong");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<SanphamCT> getListSP() {
        ArrayList<SanphamCT> list = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca san pham
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A");

            String sql = "select * from TBHDSP ";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                SanphamCT sp = new SanphamCT(resultSet.getString("MaSP"),
                        resultSet.getInt("Soluong"),
                        resultSet.getInt("Gia"));

                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public void AddSp(SanphamCT sp) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A", "sa", "123456");
           //query 
            String sql = "insert into TBHDSP values(?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, sp.getMasp());
            statement.setInt(2, sp.getSoluong());
            statement.setInt(3, sp.getGia());
            statement.execute();

        } catch (SQLException ex) {

        }
    }

    public void delete(String id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A", "sa", "123456");
            //query
            String sql = "delete from TBHDSP where MaSP = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, id);

            statement.execute();
        } catch (SQLException ex) {

        }
    }

    public static void main(String[] args) {
        new DaospCT();
    }

}
