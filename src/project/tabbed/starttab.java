
package project.tabbed;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author gomaa
 */
public class starttab extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7;
   JTextField t2,t3,t4,t6;
   JButton b1,b2;
   JButton b3;
    JPasswordField t1,t5;
 

    add a=new add();
    
    show s=new show();
    JTabbedPane t;
    public starttab(){
        ss();
    }
    public void ss(){
        this.setTitle("opened");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400,400);
        this.setLocation(200, 200);
        a.setSize(400,400);
        //label
        l1=new  JLabel("Enter the data which belonge to Student");
        l2=new JLabel("student_id");
        l3=new JLabel("student name");
        l4=new JLabel("department");
        l5=new JLabel("degree");
        l6=new JLabel("your department");
       l7=new JLabel("your password");
       //taxt
       t1=new JPasswordField();t2=new JTextField ();t3=new JTextField ();t4=new JTextField ();t5=new JPasswordField();t6=new JTextField ();
       //button
       b1=new JButton("send");b2=new JButton("cancel");
       b3=new JButton("click here");
       //size
       l1.setBounds(50, 20,250,30);
       l2.setBounds(20, 50,60,30);t1.setBounds(100,50,60,30);
        l3.setBounds(20, 100,80,30);t2.setBounds(100,100,60,30);
        l4.setBounds(20, 150,80,30);t3.setBounds(100,150,60,30);
        l5.setBounds(20, 200,80,30);t4.setBounds(100,200,60,30);
        l6.setBounds(10, 250,90,30);t5.setBounds(100,250,60,30);
         l7.setBounds(10, 300,90,30);t6.setBounds(100,300,60,30);
         b1.setBounds(50,350,70,30);b2.setBounds(150,350,100,30);
         b1.setBackground(Color.green);b2.setBackground(Color.BLACK);
         b3.setBounds(150,250,100,50);b3.setBackground(Color.red);
         a.add(l1);a.add(l2);a.add(l3);a.add(l4);a.add(l5);a.add(l6);a.add(l7);
         a.add(t1);a.add(t2);a.add(t3);a.add(t4);a.add(t5);a.add(t6);
         a.add(b1);a.add(b2);
         s.setSize(400,400);
         s.add(b3);
         t=new JTabbedPane();
         t.addTab("add", a);t.addTab("show", s);
         this.add(t);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
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
                Statement s=c.createStatement();
                String x,y,z,a,b,d;
                x=t1.getText();
                y=t2.getText();
                z=t3.getText();
                a=t4.getText();
                b=t5.getText();
                d=t6.getText();
                String query;
               query ="insert into student values('"+x+"','"+y+"','"+z+"','"+a+"','"+b+"','"+d+"')";
                s.execute(query);
                JOptionPane.showMessageDialog(this, "well done,element is inserted");
                JOptionPane.showMessageDialog(this, "ok");
                this.dispose();

               
                
            }catch (SQLException ee){
                System.out.println(ee.getMessage());
            }
        }
        else if(e.getSource()==b2){
            this.dispose();
        }
        if(e.getSource()==b3){
            JOptionPane.showMessageDialog(this, "go"+"\t"+t2.getText());
            imp i=new imp();
            this.dispose();
        }
    }
    
}
