
package project.newtable;

import javax.swing.JFrame;

public class table extends JFrame{
    NewJFrame n=new NewJFrame();
    public table(){
        this.setTitle("data");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(200, 200);
        this.setSize(500, 500);
        this.add(n);
    }
    
}
