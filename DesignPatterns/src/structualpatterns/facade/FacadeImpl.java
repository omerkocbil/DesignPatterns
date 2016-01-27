/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.facade;

/**
 *
 * @author jan
 */
public class FacadeImpl implements KomponentFacade {

    public void doSomething() {
        new BirSinif().doSomething();
    }
}
