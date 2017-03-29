/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vzbiljic.pki.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 *
 * @author vzbiljic
 */
public class Utils {
    
    public static Image ScaleImage(Image image, int w, int h){
        BufferedImage resizeImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizeImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(image, 0,0,w,h, null);
        g.dispose();
        return resizeImage;
    }
    
}
