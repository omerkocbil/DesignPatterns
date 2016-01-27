/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.chainofresponsibility;

/**
 *
 * @author jan
 */
public class KahveOtomatı {

    private static MetalPara zincir = null;

    public static void main(String[] args) {
        zincir = (new BirLira()).setNext((new ElliKurus()).setNext((new OnKurus()).setNext(new BesKurus())));
        paraAt(new BirKurus());
        paraAt(new ElliKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new BesKurus());
        paraAt(new BesKurus());
        paraAt(new BirKurus());
    }

    public static void paraAt(MetalPara para) {
        System.out.println("+++ ------------------------ +++");
        System.out.println("Otomata " + para.toString()
                + " atildi.");
        zincir.check(para);
        System.out.println("+++ ------------------------ +++\n");
    }
}
