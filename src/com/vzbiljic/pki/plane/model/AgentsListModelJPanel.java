/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.plane.model;

import com.vzbiljic.pki.bean.User;
import com.vzbiljic.pki.datasource.UserDataSource;
import com.vzbiljic.pki.frame.MainJFrame;
import com.vzbiljic.pki.plane.EditAgentJPlane;
import com.vzbiljic.pki.plane.listadapter.AgentListAdapter;
import com.vzbiljic.pki.plane.listadapter.IListAdapter;
import com.vzbiljic.pki.util.R;
import com.vzbiljic.pki.util.Util;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vzbiljic
 */
public class AgentsListModelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListAgentsModelJPanel
     */
    public AgentsListModelJPanel(String agent, String number,String agency) {
        initComponents();
        onAfterInit(agent,number,agency);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        change = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        agentLabel = new javax.swing.JLabel();
        agent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        agency = new javax.swing.JLabel();

        setBackground(com.vzbiljic.pki.util.R.color.ACCENT
        );
        setForeground(R.color.ACCENT);

        jPanel2.setBackground(java.awt.Color.white);

        delete.setBackground(com.vzbiljic.pki.util.R.color.RED);
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setMinimumSize(new java.awt.Dimension(44, 18));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Obrisi");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        change.setBackground(R.color.RED);
        change.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeMouseClicked(evt);
            }
        });

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Izmeni");

        javax.swing.GroupLayout changeLayout = new javax.swing.GroupLayout(change);
        change.setLayout(changeLayout);
        changeLayout.setHorizontalGroup(
            changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel8)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        changeLayout.setVerticalGroup(
            changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agentLabel.setText("Agent:");

        agent.setText("Marko");

        jLabel3.setText("Broj telefona:");

        number.setText("062112274");

        jLabel5.setText("agencija:");

        agency.setText("BGStan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(agentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(number)
                    .addComponent(agent)
                    .addComponent(agency))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentLabel)
                    .addComponent(agent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(agency))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeMouseClicked
        User u = UserDataSource.getInstance().findUser(agent.getText());
        
        MainJFrame.getInstance().setMainPanel(new EditAgentJPlane(u));
    }//GEN-LAST:event_changeMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        User u = UserDataSource.getInstance().findUser(agent.getText());
        UserDataSource.getInstance().remove(u);
        
        Util.getInstance().askYesOrNo("Da li ste sigurni da zelite da obrisete agenta: " + agent.getText() + " ?", new Util.IOnOptionClicked() {
            @Override
            public void onPositiveOptionClicked() {
                MainJFrame.getInstance().setListViewContentWithAdapter(new AgentListAdapter());
            }

            @Override
            public void onNegativeOptionClicked() {
            }
        });
        
        
    }//GEN-LAST:event_deleteMouseClicked
    
    private void onAfterInit(String agentName, String numberString, String agencyName) {
        agent.setText(agentName);
        number.setText(numberString);
        agency.setText(agencyName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agency;
    private javax.swing.JLabel agent;
    private javax.swing.JLabel agentLabel;
    private javax.swing.JPanel change;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel number;
    // End of variables declaration//GEN-END:variables

    
}
