/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.tabbed;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author gomaa
 */
public class imp extends JFrame{
    gom g=new gom();
    public imp(){
        this.setTitle("gomaa");
        this.setVisible(true);
        //this.setResizable(false);
        this.setSize(500, 600);
        g.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 300);
        this.add(g);
        
    }
    
}
