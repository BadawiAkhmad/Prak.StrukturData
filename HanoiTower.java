/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5_Pendahuluan;

/**
 *
 * @author akhma
 */
public class HanoiTower {
    public int move = 1;
    public void doMenara(int cakram, String awal, String bantu, String tujuan){
        if(cakram>=1){
            doMenara(cakram-1, awal, tujuan, bantu);
            move(cakram, awal, tujuan);
            doMenara(cakram-1, bantu, awal, tujuan);
        }
    }
    
    public void move(int cakram, String awal, String tujuan){
        System.out.println("Langkah "+move);
        move++;
        System.out.print("Pindahkan Cakram "+cakram);
        System.out.print(" dari "+awal);
        System.out.println(" ke "+tujuan);
    }
    
    public static void main(String[] args) {
        HanoiTower h = new HanoiTower();
        h.doMenara(3, "Tiang A", "Tiang B", "Tiang C");
    }
}
