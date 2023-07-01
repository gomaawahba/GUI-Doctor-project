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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import project.tabbed.starttab;

/**
 *
 * @author gomaa
 */
public  class scr extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2;
    fram f=new fram();
    public scr(){
        showe();
    }
    public void showe(){
        this.setTitle("Facebock");
        this.setSize(282,179);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200,200);
        this.add(f);
        // roll in
        l1=new  JLabel("Full name");
        l2=new  JLabel("password");
        l3=new  JLabel("department");
        l4=new  JLabel("WELCOME");
        t1=new JTextField();
        t2=new JTextField();
        p1=new JPasswordField();
        b1=new JButton ("login");
        b2=new JButton("sin in");
        l4.setBounds(200,5,80,40);l4.setForeground(Color.BLUE);
        l1.setBounds(10,10, 70,20);t1.setBounds(100,10,70,20);
        l2.setBounds(10,50,70,20);p1.setBounds(100,50,70,20);
        l3.setBounds(10,90,70,20);t2.setBounds(100,90,70,20);
        b1.setBounds(20,140,70,30);b2.setBounds(150,140,70,30);
        l1.setForeground(Color.red);l2.setForeground(Color.red);l3.setForeground(Color.red);
        f.add(l1);f.add(l2);f.add(t1);f.add(p1);f.add(b1);f.add(b2);
        f.add(l3);f.add(t2);f.add(l4);
        b1.setBackground(Color.red);
        b2.setBackground(Color.BLACK);
        l1.setBackground(Color.red);
        l2.setBackground(Color.BLACK);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String user="root";
            String pass="";
            String url="jdbc:mysql://localhost/collge";
            try{
                Connection c;
                c=DriverManager.getConnection(url, user, pass);
                PreparedStatement ps=c.prepareStatement("select*from doctor");
                ResultSet r=ps.executeQuery();
                while(r.next()){
                    if(r.getString("username").equalsIgnoreCase(t1.getText())){
                        if(r.getString("password").equals(p1.getText())){
                            {
                                JOptionPane.showMessageDialog(this, "ok");
                                starttab s=new starttab();
                                this.dispose();
                                
                            }
                           
                        } else{
                                JOptionPane.showMessageDialog(this, "sorry,password is not correct   "+t1.getText());
                                this.dispose();
                            }
                    }
//                    else{
//                        JOptionPane.showMessageDialog(this, "sorry");
//                        this.dispose();;
//                    }
//                    
                }
              //  if(getName)
            }catch (SQLException ee){
                System.out.println(ee.getMessage());
            }
            
           // image i=new image();
            
        }
        else if(e.getSource()==b2){
            sign s=new sign();
        }
    }
}
