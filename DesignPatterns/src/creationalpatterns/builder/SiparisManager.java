/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.builder;

/**
 *
 * @author jan
 */
public class SiparisManager {

    private SiparisBuilder builder;

    public Araba createOrder(String marka, String model, String renk, int beygirgucu) {
        if (marka.equals("Ford")) {
            builder = new FordSiparisBuilder();
        } 
        else if (marka.equals("Audi")) {
            builder = new AudiSiparisBuilder();
        }
        this.builder.setMarka(marka);
        this.builder.setModel(model);
        this.builder.setRenk(renk);
        this.builder.setBeygirGucu(beygirgucu);
        return this.builder.getAraba();
    }

    public void printOrder() {
        System.out.println("Marka: "
                + this.builder.getAraba().getMarka());
        System.out.println("Model: "
                + this.builder.getAraba().getModel());
        System.out.println("Renk: "
                + this.builder.getAraba().getRenk());
        System.out.println("Beygirgücü: "
                + this.builder.getAraba().getBeygirGucu());
    }
}
