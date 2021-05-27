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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhangDao {
     public ArrayList<Khang> getListKh() {
        ArrayList<Khang> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca san pham
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A");

            String sql = "select * from KhachHang ";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                 Khang kh = new Khang(resultSet.getInt("MaKH"),
                        resultSet.getString("TenKH"),
                        resultSet.getInt("SDT"),
                        resultSet.getString("Diachi"));

                

                list.add(kh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public static List<Khang> findAll() {
        List<Khang> Klist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca san pham
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A");

            //query
            String sql = "select * from KhachHang ";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
              Khang kh = new Khang(resultSet.getInt("MaKH"),
                        resultSet.getString("TenKH"),
                        resultSet.getInt("SDT"),
                        resultSet.getString("Diachi"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return Klist;
    }

    public static List<Khang> findByFullname(String ten) {
        List<Khang> Klist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A", "sa", "123456");
            //query
            String sql = "select * from Sanpham where ten like '%"+ ten + "%'";
            statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Khang kh = new Khang(resultSet.getInt("MaKH"),
                        resultSet.getString("TenKH"),
                        resultSet.getInt("SDT"),
                        resultSet.getString("Diachi"));
                Klist.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TkDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return Klist;
    }
}

