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
public class image2 extends JPanel{
    private ImageIcon ic;
    public image2(){
        this.setLayout(null);
        
    }
  
        public void paintComponenet(Graphics g){
            super.paintComponent(g);
            ic=new ImageIcon(getClass().getResource("7.jpg"));
            ic.paintIcon(this, g,100,100);
            
       
    }
    
}
