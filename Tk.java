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
public class Tk {
    int id ;
    String ten;
    String loai;
    int kichThuoc;
    int gia;

    public Tk() {
    }

    public Tk(int id, String ten, String loai, int kichthuoc, int gia) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.kichThuoc = kichthuoc;
        this.gia = gia;
    }

    public Tk(String ten, String loai, int kichthuoc, int gia) {
        this.ten = ten;
        this.loai = loai;
        this.kichThuoc = kichthuoc;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    

    
    
    
}
