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
public class FacadeFactory {

    private static FacadeFactory instance = new FacadeFactory();

    private FacadeFactory() {
    }

    public static FacadeFactory instance() {
        return instance;
    }

    public KomponentFacade getFacade() {
        return new FacadeImpl();
    }
}
