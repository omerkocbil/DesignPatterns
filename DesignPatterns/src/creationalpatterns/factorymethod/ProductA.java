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
public class ProductA implements Product {

    private int id;
    private String name;

    public ProductA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void doThis() {
        System.out.println("do() in ProductA");
    }

}
