/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import project.tabbed.array;

/**
 *
 * @author gomaa
 */
public class starttable extends JFrame {
    array a=new array();
    table tt=new table();
    public starttable(){
        add(a);
    }
    public void sho(){
        this.setTitle("show data");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400,400);
        this.setLocation(200, 200);
        this.add(a);
     //   this.add(this)
    }

    private void add(array a) {
                            String user="root";
            String pass="";
            String url="jdbc:mysql://localhost/user";
            Connection c;
            try {
                c=DriverManager.getConnection(url, user, pass);
                PreparedStatement s=c.prepareStatement("select id,m1,m2,m3,m4,m5,m6 from department");
                
                ResultSet r=s.executeQuery();
                Object[] obj=new Object[7];
                for(int i=1;i<=5;i++){
                    for(int j=1;j<=7;j++){
                        obj[0]=r.getString("id");
                        obj[1]=r.getString("m1");
                        obj[2]=r.getString("m2");
                        obj[3]=r.getString("m3");
                       obj[4]=r.getString("m4");
                       obj[5]=r.getString("m5");
                       obj[6]=r.getString("m6");
                    }
                }
//                while(r.next()){
//                    obj[0]=r.getString("id");
//                    obj[1]=r.getString("m1");
//                    obj[2]=r.getString("m2");
//                    obj[3]=r.getString("m3");
//                    obj[4]=r.getString("m4");
//                    obj[5]=r.getString("m5");
//                    obj[6]=r.getString("m6");
//               //     obj[7]=r.getString("m7");
//                  
//                }
               // JOptionPane.showMessageDialog(this, "ok");
               // JOptionPane.showInternalMessageDialog(this, "ok");
            } catch (SQLException ex) {
               System.out.println(ex.getMessage());
            }
    }
    
}
