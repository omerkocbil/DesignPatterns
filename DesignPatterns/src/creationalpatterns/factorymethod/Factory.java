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
public class Factory {
    public static Product create(String productType){
        Product product = null;
        if(productType.equalsIgnoreCase("a"))
            product = new ProductA(1, "Product-A-1");
        else if(productType.equalsIgnoreCase("b"))
            product = new ProductB(2, "Product-B-2");
        return product;
    }
}
