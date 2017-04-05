/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.util;

import com.sun.istack.internal.NotNull;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeDebug;

/**
 *
 * @author vzbiljic
 */
public class Util {
    
    
       
    public boolean checkIfNull(String input,String name){
       if(input == null || input.equals("")){

           alert("Neispravno uneto polje: " + name + "!");

           return true;
       }
       return false;
   }
    
    public static Util getInstance(){
        if(null == instance){
            instance = new Util();
        }
        return instance;
    }
    
    public Image scaleImage(Image image, int w, int h){
        BufferedImage resizeImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizeImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(image, 0,0,w,h, null);
        g.dispose();
        return resizeImage;
    }
    
    public void alert(String alertMessage) {
        JOptionPane optionPane = new JOptionPane(alertMessage,JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Greska!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    public void askYesOrNo(String question,@NotNull IOnOptionClicked listener){
        Object[] options = {"Ne", "Da"};
        Icon icon = null;
        try {
            icon = new ImageIcon(Util.getInstance().scaleImage(ImageIO.read(getClass().getResource(R.drawable.home_icon)),50, 50));
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int result = JOptionPane.showOptionDialog(
                null, 
                question, 
                "", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                icon, 
                options, 
                options[0]);
        if(null != listener){
            switch (result) {
                case 0://No
                    listener.onNegativeOptionClicked();
                    break;
                case 1://Yes
                    listener.onPositiveOptionClicked();
                    break;
            }
        }else{
            throw new RuntimeException("IOnOptionClicked should not be null!");
        }
        
    }

    public boolean checkIfNumber(String input,String name){
       if(input == null || input.equals("")){

           alert("Dozvoljen je samo celobrojan ubnos" + name + "!");

           return true;
       }

       return false;
   }
    private Util(){
        
    }
    
    private static Util instance;
    
    public static interface IOnOptionClicked{
        /**
         *  will be called when positive option is selected
         */
        public void onPositiveOptionClicked();
        
        /**
         *  will be called when negative option is selected
         */
        public void onNegativeOptionClicked();
    }
}
