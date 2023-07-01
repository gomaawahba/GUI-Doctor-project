/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newtable;

import javax.swing.JFrame;

/**
 *
 * @author gomaa
 */
public class mm extends JFrame{
    framta f=new framta();
    public mm(){
          this.setTitle("data");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(200, 200);
        this.setSize(500, 500);
        this.setLayout(null);
        f.setBounds(100, 100,200,200);
        this.add(f);
    }
    
}
