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
public abstract class SiparisBuilder {

    private Araba araba = null;

    public SiparisBuilder() {
    }

    public Araba getAraba() {
        if (araba == null) {
            araba = new Araba();
        }
        return araba;
    }

    public abstract void setMarka(String marka);

    public abstract void setModel(String model);

    public abstract void setRenk(String renk);

    public abstract void setBeygirGucu(int bg);
}
