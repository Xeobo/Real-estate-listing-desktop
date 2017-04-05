/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.plane.listadapter;

import com.vzbiljic.pki.datasource.UserDataSource;
import com.vzbiljic.pki.plane.ListJPanel;
import com.vzbiljic.pki.plane.model.AgentsListModelJPanel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author vzbiljic
 */
public class AgentListAdapter implements IListAdapter{

    @Override
    public void fillList(JPanel listPanel) {
        for(int i=0; i<UserDataSource.getInstance().size();i++){
            listPanel.add(
                    new AgentsListModelJPanel(
                            UserDataSource.getInstance().get(i).getUsername(), 
                            UserDataSource.getInstance().get(i).getTelephone(), 
                            UserDataSource.getInstance().get(i).getAgency())
            );
        }
    }
    
}
