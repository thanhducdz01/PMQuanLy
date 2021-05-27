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
public class SanphamCT {
    private String Masp;
    private int Soluong;
    private int Gia;

    public SanphamCT() {
    }

    public SanphamCT(int Soluong, int Gia) {
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public SanphamCT(String Masp, int Soluong, int Gia) {
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

   

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
    
    
}
