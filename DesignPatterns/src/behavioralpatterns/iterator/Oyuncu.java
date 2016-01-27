/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.iterator;

/**
 *
 * @author jan
 */
public class Oyuncu {
    
    String isim;
    
    int numara;
    
    public Oyuncu(String isim, int numara){
        this.isim=isim;
        this.numara = numara;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    
    String getIsim() {
        return this.isim;
    }
    
    void setIsim(String isim){
        this.isim=isim;
    }
    
}
