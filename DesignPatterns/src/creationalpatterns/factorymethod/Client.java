/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.factorymethod;

/**
 *
 * @author jan
 */
public class Client {
    private Product productA;
    private Product productB;
     
    public Client(){
        productA = Factory.create("a");
        productB = Factory.create("b");
    }
     
    public void start(){
        productA.doThis();
        productB.doThis();
    }
}
