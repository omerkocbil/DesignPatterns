/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.chainofresponsibility;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public abstract class MetalPara {

    private ArrayList metalParaListesi = new ArrayList();
    
    private int value;
    
    /*
     * Zincirde yeralan bir sonraki nesne
     */
    private MetalPara next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MetalPara getNext() {
        return next;
    }

    public MetalPara setNext(MetalPara next) {
        this.next = next;
        return this;
    }

    public void check(MetalPara para) {
        System.out.println("Siradaki nesne sadece "
                + this + " isleyebilir.");
        if (para.getValue() != this.value) {
            System.out.println("Uymadi, zincirdeki bir "
                    + "sonraki nesneye iletiyoruz.");
            if (getNext() != null) {
                getNext().check(para);
            } else {
                System.out.println("Zincirin sonundayiz. "
                        + "Metal para " + para.toString() + " "
                        + "bu otomat için uygun degil.");
            }
        } else {
            metalParaListesi.add(para);
            System.out.println("Otomat tarafindan "
                    + this.toString() + " kabul edildi");
        }
    }
}
