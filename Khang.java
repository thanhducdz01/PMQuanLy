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
public class Khang {
    int MaKH;
    String TenKH;
    int SDT;
    String Diachi;

    public Khang() {
    }

    public Khang(String TenKH, int SDT, String Diachi) {
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.Diachi = Diachi;
    }

    public Khang(int MaKH, String TenKH, int SDT, String Diachi) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.Diachi = Diachi;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    
    
}
