/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.plane.listadapter;

import javax.swing.JPanel;

/**
 *
 * @author vzbiljic
 */
public interface IListAdapter {
    /**
     * @param listPanel - Panel in form of list. Client should only add panels to
     * initialize panel. Client <b>shouldn't</b> call repaint, neither <b>revalidate</b> after adding!
     *  
    */
    void fillList(JPanel listPanel);
}
