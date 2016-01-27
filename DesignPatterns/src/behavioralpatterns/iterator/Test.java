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
public class Test {

    public static void main(String[] args) {
        AnadoluEfes anadoluEfes = new AnadoluEfes();
        Iterator it = (Iterator) anadoluEfes.getIterator();
        while (it.hasNext()) {
            Oyuncu oyuncu = (Oyuncu) it.next();
            System.out.println(oyuncu.getIsim());
        }
        FenerbahceBasketbol fenerbahce = new FenerbahceBasketbol();
        it = (Iterator) fenerbahce.getIterator();
        while (it.hasNext()) {
            Oyuncu oyuncu = (Oyuncu) it.next();
            System.out.println(oyuncu.getIsim());
        }
    }
}
