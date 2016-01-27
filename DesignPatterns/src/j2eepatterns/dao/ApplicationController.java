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
public class ApplicationController {

    private Dao dao;

    public ApplicationController(Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    /*
     * DAO üzerinden bir TestData nesnesi edinir.
     */
    public TestData getTestData(int id) {
        return dao.getTestData(id);
    }
    
    /*
    * DAO üzerinden tüm TestData listesini edinir.
    */
    public List<TestData> getTestDataList() {
        return dao.getTestDataList();
    }
}
