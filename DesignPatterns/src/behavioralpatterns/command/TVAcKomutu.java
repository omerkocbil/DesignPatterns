/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.command;

/**
 *
 * @author jan
 */
public class TVAcKomutu implements Komut {

    private Televizyon tv = null;

    public TVAcKomutu(Televizyon tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.ac();
    }
}
