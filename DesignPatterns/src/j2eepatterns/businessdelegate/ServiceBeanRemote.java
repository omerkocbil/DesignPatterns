/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.businessdelegate;

import java.io.Serializable;

/**
 *
 * @author jan
 */
public interface ServiceBeanRemote extends Serializable {
    
    public String getValue();
}
