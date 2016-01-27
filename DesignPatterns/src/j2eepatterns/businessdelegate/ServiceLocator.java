/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.businessdelegate;

import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author jan
 */
public class ServiceLocator {

    /*
     * Olusturulan ejb remote interface nesnei cache içinde tutulur. Böylece her
     * defasinda lookup işlemi yapilmak zorunda kalinmaz.
     */
    private Map<String, ServiceBeanRemote> cache;
    private InitialContext ctx;
    
    /*
     * Ssingleton tasarım Şablonunu kullanarak sistemde tek bir ServiceLocator
     * olacak sekilde olusturuyoruz.
     */
    private static ServiceLocator locator
            = new ServiceLocator();

    private ServiceLocator() {
        try {
            /*
             * Lookup için gerekli ctx ve remote interface nesnelerin tutuldugu
             * cache nesnesini olusturuyoruz.
             */
            ctx = new InitialContext();
            cache = new HashMap<String, ServiceBeanRemote>();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ServiceLocator instance() {
        return locator;
    }

    /*
     * Lookup ismi verilen bir EJB komponentini geri verir.
     */
    public ServiceBeanRemote getService(String lookup) {
        ServiceBeanRemote remote = null;
        if (cache.containsKey(lookup)) {
            remote = (ServiceBeanRemote) cache.get(lookup);
        } else {
            try {
                remote = (ServiceBeanRemote) ctx.lookup(lookup);
                cache.put(lookup, remote);
            } catch (NamingException e) {
                throw new RuntimeException(e);
            }
        }
        return remote;
    }
}
