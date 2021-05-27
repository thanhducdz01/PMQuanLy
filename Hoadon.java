/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcuoiki;

/**
 *
 * @author DUC
 */
public class Hoadon {
    private int MaHD;
    private  String NgayDat;
    private int Thanhtien;

    public Hoadon() {
    }

    public Hoadon(String NgayDat, int Thanhtien) {
        this.NgayDat = NgayDat;
        this.Thanhtien = Thanhtien;
    }

    public Hoadon(int MaHD, String NgayDat, int Thanhtien) {
        this.MaHD = MaHD;
        this.NgayDat = NgayDat;
        this.Thanhtien = Thanhtien;
    }

    Hoadon(int aInt, String string, String string0, boolean add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(String NgayDat) {
        this.NgayDat = NgayDat;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
    
    
}
