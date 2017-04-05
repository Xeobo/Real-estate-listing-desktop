/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.plane.listadapter;

import com.vzbiljic.pki.datasource.PropertyDataSource;
import com.vzbiljic.pki.datasource.UserDataSource;
import com.vzbiljic.pki.plane.model.AgentsListModelJPanel;
import com.vzbiljic.pki.plane.model.PropertiesListJPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author vzbiljic
 */
public class PropertyListAdapter implements IListAdapter{

    @Override
    public void fillList(JPanel listPanel) {
        listPanel.setLayout(new BoxLayout(listPanel,BoxLayout.X_AXIS));
        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        
        for(int i=0; i<PropertyDataSource.getInstance().size();i++){
            JPanel currentPanel;
            if(0 == i % 2){
                currentPanel = leftPanel;
            }else{
                currentPanel = rightPanel;
            }
            currentPanel.add(new PropertiesListJPanel(
                    PropertyDataSource.getInstance().get(i)
            ));
        }
        
        listPanel.add(leftPanel);
        listPanel.add(rightPanel);
    }
    
}
