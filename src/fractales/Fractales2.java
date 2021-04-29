/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractales;


import java.applet.*;
import java.awt.*;
import java.lang.*;

/**
 *
 * @author Jean
 */
public class Fractales2 extends Applet{
    public void init(){
        setBackground(Color.WHITE);
        setSize(1500,1080);
    }
    
    
    public void paint(Graphics g){        
        makeTree(110,0,750,950,g);
        
    }
    
    void makeTree(int length, float angle, int x, int y, Graphics g) {
        float v;
        int xmove = (int)(Math.cos(Math.toRadians(angle+90))*length);
        int ymove = (int)(Math.sin(Math.toRadians(angle-90))*length);
        g.drawLine(x, y, x+xmove, y+ymove);        
        
        if(length >= 1){         
            v = (float) (Math.random()*30);
            makeTree(length-7, angle+v, x+xmove,y+ymove,g);
            makeTree(length-7, angle-v, x+xmove,y+ymove,g);
        }
    }

  
}
