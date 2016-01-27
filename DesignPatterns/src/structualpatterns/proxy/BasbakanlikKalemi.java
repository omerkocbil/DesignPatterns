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
public class BasbakanlikKalemi {
    private Basbakan basbakan;
     
    public BasbakanlikKalemi(){
        basbakan = new VekilBasbakan();
    }
 
    public Basbakan banaBasbakaniCagir(){
        System.out.println("Basbakanlık Kalemi: Tabi efendim");
        return basbakan;
    }
}
