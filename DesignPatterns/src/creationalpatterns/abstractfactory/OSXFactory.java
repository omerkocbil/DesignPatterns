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
public class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
 
    @Override
    public List createList() {
        return new OSXList();
    }
 
    @Override
    public Table createTable() {
        return new OSXTable();
    }
}
