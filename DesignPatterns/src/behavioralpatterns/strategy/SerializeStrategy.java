/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioralpatterns.strategy;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author jan
 */
public class SerializeStrategy implements Strategy {

    public void save(Bean bean) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("c:/temp/bean.ser"));
            out.writeObject(bean);
            out.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
