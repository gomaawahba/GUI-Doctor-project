
package project;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class fram extends JPanel{
    private ImageIcon i;
    
    public fram(){
        this.setLayout(null);
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        i=new ImageIcon(getClass().getResource("v3.jpg"));
        i.paintIcon(this, g,0,0);
        
    }
    
}
