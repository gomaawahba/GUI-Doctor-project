/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import javax.swing.JFrame;

/**
 *
 * @author gomaa
 */
public class imageclass extends JFrame{
    image2 i=new image2();
//      image2 ii=new image2();
    public imageclass(){
        img();
        
    }
    public void img(){
        this.setTitle("facebock");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(120,130);
        this.add(i);
       // this.add(ii);
        //this.setLayout(null);

    }
    
}
