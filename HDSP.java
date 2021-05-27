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
public class HDSP {
   
    private  String  Masp;
    private int SoLuong;
    private int Gia;

    public HDSP() {
    }

    public HDSP(String Masp, int SoLuong, int Gia) {
        this.Masp = Masp;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public HDSP(int id, String Masp, int SoLuong, int Gia) {
       
        this.Masp = Masp;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }
     

  

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
    
}
