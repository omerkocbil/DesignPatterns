/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.adapter.classadapter;

/**
 *
 * @author jan
 */
public class KullaniciSinif {

    public static void main(String[] args) {
        /*
         * AdapterSinifi, BirInterface interface
         * sinifini implemente ettigi için
         * BirInterface olarak sistem içinde
         * kullanilabilir.
         */
        BirInterface birInterface = new AdapterSinifi();
        birInterface.birMetod();
    }
}
