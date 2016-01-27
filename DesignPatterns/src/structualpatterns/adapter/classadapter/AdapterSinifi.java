/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structualpatterns.adapter.classadapter;

/**
 * Adaptasyonu gerceklestirmek için kullanilan sinif. BirInterface sinifini
 * implemente ederek, KullaniciSinifi için Özcan Acar - www.KurumsalJava.com
 * kullanilabilir bir sinif haline gelir.
 */
/**
 *
 * @author jan
 */
public class AdapterSinifi extends AdapteEdilenSinif implements BirInterface {

    public void birMetod() {
        /**
         * AdapterEdilenSinif içinde yeralan herhangiBirMetod() metodunu miras
         * olarak alir. KullaniciSinifi tarafindan birMetod() metodu
         * kullanildiginda, bu metod herhangiBirMetod() metoduna delege edilir
         * ve islem AdapteEdilenSinif sinifina devredilmis (adapte) edilmis
         * olur.
         */
        herhangiBirMetod();
    }
}
