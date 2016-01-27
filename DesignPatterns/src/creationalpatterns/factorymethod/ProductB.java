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
public class ProductB implements Product {

    private int no;
    private String description;
     
    public ProductB(int no, String description) {
        this.no = no;
        this.description = description;
    }

    @Override
    public void doThis() {
        System.out.println("do() in ProductB");
    }

}
