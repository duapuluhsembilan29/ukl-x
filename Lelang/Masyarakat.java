/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author alkaa
 */
import java.util.ArrayList;
public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat(){
        this.namaMasyarakat.add("Bintang");
        this.alamat.add("Italy");
        this.telepon.add("085678980990");
        
        this.namaMasyarakat.add("Alkaa");
        this.alamat.add("Spanyol");
        this.telepon.add("082143362962");
    }
    
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void tampilkanUser(){
        int n = this.namaMasyarakat.size();
        for(int i=0;i<n;i++){
            System.out.println("---------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("----------------------------");
        }
    }
    
}
