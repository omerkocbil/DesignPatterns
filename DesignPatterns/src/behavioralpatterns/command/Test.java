/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.command;

/**
 *
 * @author jan
 */
public class Test {

    public static void main(String[] args) {
// Kumanda aletini olusturur
        Kumanda kumanda = new Kumanda();
// sifir nolu tusa basar
        kumanda.tusla(0); // televizyonu acar
// bir nolu tusa basar
        kumanda.tusla(1); // televizyonu kapatir
    }
}
