/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.businessdelegate;

/**
 *
 * @author jan
 */
public class BusinessDelegate {

    /*
     * Kullanılan ejb komponenti
     */
    private ServiceBeanRemote service;

    /*
     * Konstruktör bünyesinde ServiceLocator sinifi kullanilarak ejb komponenti
     * olusturuluyor.
     */
    public BusinessDelegate() {
        service = ServiceLocator.instance().getService("ServiceBean/remote");
    }

    /*
     * getValue() metodu ejb komponentine delege ediliyor.
     */
    public String getValue() {
        return service.getValue();
    }
}
