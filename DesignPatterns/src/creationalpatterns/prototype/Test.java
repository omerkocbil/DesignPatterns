/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.prototype;

import java.util.Date;

/**
 *
 * @author jan
 */
public class Test {
    public static void main(String[] args) {
        IndividualCustomer unAuthenticatedCoskunCustomerPrototype = new IndividualCustomer(1,
                "Cumhuriyet Cad. No 28 Beşiktaş Istanbul", "2128399041",
                "Selim", "Coskun", new Date());
        System.out.println(unAuthenticatedCoskunCustomerPrototype);
         
         
        IndividualCustomer authenticatedAhmetCoskun = (IndividualCustomer) unAuthenticatedCoskunCustomerPrototype.clone();
        authenticatedAhmetCoskun.setId(2);
        authenticatedAhmetCoskun.setFirstName("Ahmet");
        authenticatedAhmetCoskun.setAuthenticated(true);
        System.out.println(authenticatedAhmetCoskun);
         
         
        CorporateCustomer unAuthenticatedGECustomerPrototype = new CorporateCustomer(100, "Manolya Cad. No 5 Sariyer Istanbul", "2124199047", "GE", 0.25);
        System.out.println(unAuthenticatedGECustomerPrototype);
 
    }
}
