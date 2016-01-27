/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jan
 */
public class AnadoluEfes implements Takim {

    private ArrayList<Oyuncu> takim;

    public AnadoluEfes() {
        takim = new ArrayList();
        takim.add(new Oyuncu("Drew", 4));
        takim.add(new Oyuncu("Ender", 6));
        takim.add(new Oyuncu("Cenk", 7));
        takim.add(new Oyuncu("Kerem", 12));
        takim.add(new Oyuncu("Loren", 15));
    }

    public ArrayList<Oyuncu> getTakim() {
        return takim;
    }

    public void setTakim(ArrayList<Oyuncu> takim) {
        this.takim = takim;
    }

    @Override
    public Iterator getIterator() {
        return (Iterator) new ArrayListIterator(getTakim());
    }
}
