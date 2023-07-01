/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author gomaa
 */
public class image extends JPanel {
    private ImageIcon i;
    public image(){
        this.setLayout(null);
       
    }
  
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        i=new ImageIcon(getClass().getResource("g3.jpg"));
//        i2=new ImageIcon(g.getClass().getResource("g5.jpg"));
//        i3=new ImageIcon(g.getClass().getResource("g6.jpg"));
//        i4=new ImageIcon(g.getClass().getResource("g7.jpg"));
//        i5=new ImageIcon(g.getClass().getResource("g8.jpg"));
        i.paintIcon(this, g, 0, 0);
//        i2.paintIcon(this, g, 200, 0);
//        i3.paintIcon(this, g, 0, 200);
//        i4.paintIcon(this, g, 200, 200);
//        i5.paintIcon(this, g, 200, 400);
        
        
        
    }
            
}
        

        

