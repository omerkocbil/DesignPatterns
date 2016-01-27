/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.dao;

import java.util.List;

/**
 *
 * @author jan
 */
public class Test {

    /*
     * Iki değişik DAO implementasyon sinifini test eder.
     */
    public static void main(String[] args) {
        ApplicationController controller = new ApplicationController(new JDBCDaoImpl());
        List<TestData> list = controller.getTestDataList();
        for (int i = 0; i < list.size(); i++) {
            TestData data = list.get(i);
            System.out.println(data.getTest1());
            System.out.println(data.getTest2());
        }
        controller.setDao(new DummyDaoImpl());
        list = controller.getTestDataList();
        for (int i = 0; i < list.size(); i++) {
            TestData data = list.get(i);
            System.out.println(data.getTest1());
            System.out.println(data.getTest2());
        }
    }
}
