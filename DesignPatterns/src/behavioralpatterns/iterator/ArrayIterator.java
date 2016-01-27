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
public class ArrayIterator implements Iterator {

    private Oyuncu[] takim;
    private int pozisyon;

    public int getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(int pozisyon) {
        this.pozisyon = pozisyon;
    }

    public ArrayIterator(Oyuncu[] takim) {
        setTakim(takim);
    }

    public boolean hasNext() {
        if (pozisyon >= getTakim().length
                || getTakim()[pozisyon] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Oyuncu oyuncu = getTakim()[pozisyon];
        pozisyon++;
        return oyuncu;
    }

    public Oyuncu[] getTakim() {
        return takim;
    }

    public void setTakim(Oyuncu[] takim) {
        this.takim = takim;
    }
}
