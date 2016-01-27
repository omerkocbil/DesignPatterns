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
public class TVKapatKomutu implements Komut {

    private Televizyon tv = null;

    public TVKapatKomutu(Televizyon tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.kapat();
    }
}
