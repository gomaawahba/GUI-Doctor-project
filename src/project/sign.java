/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gomaa
 */
public class sign extends JFrame implements ActionListener {
     JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    JPanel j;
    public sign(){
        this.setTitle("sign");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,400);
         l1=new  JLabel("phone number");
        l2=new  JLabel("code");
        t1=new JTextField();
        p1=new JPasswordField();
        b1=new JButton ("save");
        b2=new JButton("cancel");
        this.setLayout(null);
        j=new JPanel();
        l1.setBounds(40,50, 70,30);t1.setBounds(150,50,70,30);
        l2.setBounds(40,100,70,30);p1.setBounds(150,100,70,30);
        b1.setBounds(60,130,70,30);b2.setBounds(140,130,90,30);
        j.setBounds(100,100,400,400);
        j.setBackground(Color.BLACK);
        j.add(l1);j.add(l2);j.add(t1);j.add(p1);j.add(b1);j.add(b2);
        b1.setBackground(Color.red);
        b2.setBackground(Color.red);
        this.add(j);
        b1.addActionListener(this);
        b2.addActionListener(this);
        //this.add(l1);this.add(l2);this.add(t1);this.add(p1);this.add(b1);this.add(b2);
    
         
           
    
                
             
       
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            scr s=new scr();
            JOptionPane.showMessageDialog(this, "ok you signed..");
        }
        else if(e.getSource()==b2){
            this.dispose();
        }
        
    }
    
}
