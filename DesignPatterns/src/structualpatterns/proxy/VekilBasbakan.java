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
public class VekilBasbakan implements Basbakan{
    private Basbakan gercekBasbakan = new GercekBasbakan();
 
    @Override
    public void dertDinle(String dert) {
        System.out.println("Vekil: Derdinizi dinliyorum.");
         
//      if(......)  // Bütün kontroller burada!
        gercekBasbakan.dertDinle(dert);
    }
 
    @Override
    public void isBul(String is) {
        System.out.println("Vekil: Isteginizi dinliyorum.");
        
//      if(......)  // Bütün kontroller burada!
        gercekBasbakan.isBul(is);
    }
}
