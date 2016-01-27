/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns.singleton;

/**
 *
 * @author jan
 */
public class Singleton {
    /*
     * Singleton sinifindan olusturulabilecek
     * tek nesne static sinif degiskeni olarak
     * tanimlaniyor.
     */

    private static Singleton instance = null;
    /*
     * Double check locking yapabilmek
     * icin kullanilan nesne.
     */
    private static Object lock = new Object();

    private Singleton() {
        System.out.println("singletion init()");
    }

    /**
     * Singleton sinifindan olusturulabilen tek nesneye ulasmak icin instance()
     * metodu kullanilir.
     *     
* @return Singleton static Singleton nesnesi
     */
    public static Singleton getInstance() {
        if (instance == null) {
// Double checked locking
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * Singleton sinifinda bulunan bir metod.
     */
    public void printThis() {
        System.out.println(this);
    }
}
