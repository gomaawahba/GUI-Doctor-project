/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.tabbed;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author gomaa
 */
public class gom extends JPanel implements ActionListener {
    JButton b=new JButton("chang color");
    JColorChooser c=new JColorChooser();
    public gom(){
        this.add(b);
        b.addActionListener(this);
    }
     Timer tt=new Timer(20,this);
    int bb1=5,bb2=5;
    int b1=400;
    int b2=100;
    JButton r=new JButton("left");
    JButton l=new JButton("right");
    JButton r1=new JButton("up");
    JButton l1=new JButton("down");
    protected void paintComponent(Graphics g){
      //  tt.start();
        super.paintComponent(g);
        r.setBounds(350,200,70,30);
        l.setBounds(450,200,70,30);
        r1.setBounds(350,250,70,30);
        l1.setBounds(450,250,70,30);
        this.add(r);this.add(l);this.add(r1);this.add(l1);
        //g.fill3DRect(100,200,100,100,true);
//        g.drawLine(10,10,100,100);
//        g.setColor(Color.BLACK);
         g.setColor(Color.red);
        g.drawLine(10,100,200,100);
        g.setColor(Color.BLUE);
        g.drawLine(200,100,200,300);
        g.setColor(Color.YELLOW);
        g.drawLine(10,100,200,300);
       g.setColor(Color.BLUE);
       g.fillOval(b1,b2,75,75);
       g.setColor(Color.red);
       //g.drawRect(200, 300,400,500, true);
       g.draw3DRect(200,300,400,500, true);
       g.setColor(Color.red);
       g.drawLine(600,100,600,300);
       g.setColor(Color.BLUE);
       g.drawLine(600,100,800,100);
       g.setColor(Color.GREEN);
       g.drawLine(800,100,600,300);
       r.addActionListener(this);
       l.addActionListener(this);
        r1.addActionListener(this);
       l1.addActionListener(this);  
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
         Color vv=c.showDialog(null,"select color",Color.BLACK);
        this.setBackground(vv);
        }
       
       if(e.getSource()==r){
           b1-=bb1;
       }else if(e.getSource()==l){
           b1+=bb1;
       }
       if(e.getSource()==r1){
           b2-=bb2;
       }else if(e.getSource()==l1){
           b2+=bb2;
       }
//        b1+=bb1;
//        b2+=bb2;
     repaint();
    }
        
    }
    

