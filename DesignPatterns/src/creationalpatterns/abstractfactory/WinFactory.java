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
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
 
    @Override
    public List createList() {
        return new WinList();
    }
 
    @Override
    public Table createTable() {
        return new WinTable();
    }
}
