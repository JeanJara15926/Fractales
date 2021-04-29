/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractales;

import java.applet.*;
import java.awt.*;
import java.lang.*;


public class Fractales extends Applet {
    

    public void init(){
        setBackground(Color.WHITE);
        setSize(1200,600);
    }
    
    public void paint(Graphics g){        
        makeTree(100,0,600,550,g);
        
    }
    
    
    void makeTree(int length, float angle, int x, int y, Graphics g) {
        float v;
        int xmove = (int)(Math.cos(Math.toRadians(angle+90))*length);
        int ymove = (int)(Math.sin(Math.toRadians(angle-90))*length);
        g.drawLine(x, y, x+xmove, y+ymove);        
        if(length >= 1){         
            
            makeTree(length-10, angle+30, x+xmove,y+ymove,g);
            makeTree(length-10, angle-30, x+xmove,y+ymove,g);
        }
        
    }
    
}
