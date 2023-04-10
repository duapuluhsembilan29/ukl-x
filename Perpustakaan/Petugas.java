/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author alkaa
 */
public class Petugas implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaKaryawan.add("Gyda Twinsz");
        this.alamat.add("Solo");
        this.telepon.add("081********");
        
        this.namaKaryawan.add("Naufal Twinsz");
        this.alamat.add("Semarang");
        this.telepon.add("081*********");
    }
    
    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void tampilKaryawan(){
        int n = this.namaKaryawan.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }
    
}
