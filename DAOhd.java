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

public class DAOhd {

    private Connection conn;

    public DAOhd() {
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

    public ArrayList<Hoadon> getListHD() {
        ArrayList<Hoadon> list = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A");

            String sql = "select * from HD ";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Hoadon s = new Hoadon();
                s.setMaHD(rs.getInt("MaHD"));
                s.setNgayDat(rs.getString("Ngaydat"));
                s.setThanhtien(rs.getInt("Thanhtien"));
                list.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void AddHD(Hoadon hd) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A", "sa", "123456");
            String sql = "insert into HD(Ngaydat,ThanhTien)values(?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, hd.getNgayDat());
            statement.setInt(2, hd.getThanhtien());
            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static List<Hoadon> findByDate(String Date) {
        List<Hoadon> listhd = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-0T38HKO:1433/A", "sa", "123456");
            //query
            String sql = "select * from HD where Ngaydat like '%" + Date + "%'";
            statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Hoadon b = new Hoadon(resultSet.getInt("MaHD"),
                        resultSet.getString("Ngaydat"),
                        resultSet.getInt("ThanhTien"));
                listhd.add(b);
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

        return listhd;
        
    }

    public static void main(String[] args) {
        new DAOhd();
    }
}
