


import javax.swing.*;
import java.awt.*;



public class Draw extends JPanel{
    
    public void drawing(){
        repaint();
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.YELLOW);
        g.fillOval(250, 250, 70, 70);
        g.setColor(Color.BLUE);
        g.fillOval(80, 240, 50, 50);
        
    }
}
