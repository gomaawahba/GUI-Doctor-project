
package project;

import javax.swing.JFrame;


public class login extends JFrame {
    //image im=new image();
    image i=new image();
    public login(){
        this.setLayout(null);
       log(); 
       System.out.println("ok");
      // this.add(im);
    }
    public void log(){
        this.setTitle("your");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(124,124);
        this.add(i);
       // this.setLocation(300, 300);
        //this.add(im);
        
        
        
    }

}
    

