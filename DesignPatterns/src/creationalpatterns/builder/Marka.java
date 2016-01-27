/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.builder;

/**
 *
 * @author jan
 */
public class Marka {

    private String marka;

    public Marka(String marka) {
        setMarka(marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String toString() {
        return marka;
    }
}
