/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.abstractfactory;

/**
 *
 * @author jan
 */
public class Client {
    public Client(GUIFactory factory){
        Component button = factory.createButton();
        button.paint();
         
        Component list = factory.createList();
        list.paint();
         
        Component table = factory.createTable();
        table.paint();
    }
}
