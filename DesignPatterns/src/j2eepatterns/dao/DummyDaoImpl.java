/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jan
 */
public class DummyDaoImpl implements Dao {

   /*
    * DummyDAOImpl bünyesinde TestData nesneleri bilgibankasından elde edilen 
    * verilerle değil, sabit değerler kullanılarak oluşturulur
    */
    public TestData getTestData(int id) {
        TestData data = new TestData();
        data.setTest1("test1");
        data.setTest2("test2");
        return data;
    }

    public List<TestData> getTestDataList() {
        ArrayList<TestData> list = new ArrayList<TestData>();
        TestData data = new TestData();
        data.setTest1("test1");
        data.setTest2("test2");
        list.add(data);
        data = new TestData();
        data.setTest1("test11");
        data.setTest2("test22");
        list.add(data);
        return list;
    }
}
