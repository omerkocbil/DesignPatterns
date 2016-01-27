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
public class GercekBasbakan implements Basbakan{
    @Override
    public void dertDinle(String dert) {
        System.out.println("Basbakan: Dinliyorum.");
    }
 
    @Override
    public void isBul(String is) {
        System.out.println("Basbakan: Dinliyorum.");
    }
}
