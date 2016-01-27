/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.proxy;

/**
 *
 * @author jan
 */
public class Test {
    public static void main(String[] args) {
        BasbakanlikKalemi kalem = new BasbakanlikKalemi();
        Vatandas riza = new Vatandas(kalem);
        riza.derdiniAnlat();
        riza.isIste();
    }
}
