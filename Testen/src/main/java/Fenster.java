


import javax.swing.*;



public class Fenster {

    
    public static void main (String[] args){
        JFrame frame = new JFrame("Sonnensystem");
        frame.setVisible(true);
        frame.setSize(500,500);
        
        JLabel label1;
        label1 = new JLabel("Sonne");
        label1.setBounds(265,320,50,30);
        frame.add(label1);
        JLabel label2;
        label2 = new JLabel("Planet");
        label2.setBounds(85,280,60,40);
        frame.add(label2);
        
        Draw kreise = new Draw();
        frame.add(kreise);
        kreise.drawing();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
