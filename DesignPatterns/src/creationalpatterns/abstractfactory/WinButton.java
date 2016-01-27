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
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("Painting a Win Button!");
    }
    
}
