/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.decorator;

/**
 *
 * @author jan
 */
public class CerceveliAyna extends AynaDecorator {

    /*
     * Üretim için kullanilan sinif. addBorder metodu ile aynaya cerceve ekler.
     */
    public void produce() {
        getAyna().produce();
        addBorder();
    }

    /*
     * Cerceve ekleme islemini gerceklestirmek için kullanilan metod.
     *
     */
    public void addBorder() {
        System.out.println("Aynaya cerceve eklendi.");
    }
}
