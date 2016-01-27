/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.businessdelegate;

/**
 *
 * @author jan
 */
public class Test {

    /*
     * Bu test sinifi sadece örnek olarak programlanmistir. EJB 3 komponent
     * kullanildigi için, test sinifinin calismasi imkansizdir. Örneğin
     * calistirilabilmesi için EJB komponentin JBOSS 4 gibi bir application
     * server üzerinde deploy edilmesi gerekmektedir.
     */
    public static void main(String[] args) {
        BusinessDelegate delegate = new BusinessDelegate();
        System.out.println(delegate.getValue());
    }
}
