/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.strategy;

/**
 *
 * @author jan
 */
public class Test {

    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.setCounter(10);
        bean.setName("name");
        FileManager.instance().saveBean(bean);
    }
}
