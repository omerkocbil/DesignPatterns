/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.adapter.objectadapter;

/**
 *
 * @author jan
 */
public class AdapterSinifi extends KullanilanSinif {

    private AdapteEdilenSinif AdapteEdilenSinif = new AdapteEdilenSinif();

    /*
     * Bu metoda gelen cagrilar, sinif degiskeni olan AdapteEdilenSinif
     * degiskenine gönderilir.
     */
    public void birMetod() {
        getAdapteEdilenSinif().herhangiBirMetod();
    }

    public AdapteEdilenSinif getAdapteEdilenSinif() {
        return AdapteEdilenSinif;
    }

    public void setAdapteEdilenSinif(AdapteEdilenSinif AdapteEdilenSinif) {
        this.AdapteEdilenSinif = AdapteEdilenSinif;
    }
}
