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
public interface Dao {

    /*
     * Bilgibankasından testdata listesini almak için tanimlanan metod.
     */
    List<TestData> getTestDataList();

    /*
     * testdata recordunu bulmak için kullanılan motod.
     */
    TestData getTestData(int id);
}
