/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.proxy;

/**
 *
 * @author jan
 */
public class Vatandas {
    private Basbakan basbakan;
     
    public Vatandas(BasbakanlikKalemi kalem){
        basbakan = kalem.banaBasbakaniCagir();
    }
 
    public String derdiniAnlat(){
        basbakan.dertDinle("Bir derdim var...");
        return "Yasasiiinnn!!!";
    }
     
     
    public String isIste(){
        basbakan.isBul("Oglum");
        return "Yasasiiinnn!!!";
    }
}
