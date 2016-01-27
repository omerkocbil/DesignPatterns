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
public class FordSiparisBuilder extends SiparisBuilder {

    public FordSiparisBuilder() {
    }

    public void setBeygirGucu(int bg) {
        getAraba().setBeygirGucu(bg);
    }

    public void setMarka(String marka) {
        getAraba().setMarka(new Marka(marka));
    }

    public void setModel(String model) {
        getAraba().setModel(new Model(model));
    }

    public void setRenk(String renk) {
        getAraba().setRenk(renk);
    }
}
