package ejercicio1.beraliajovel;

import java.awt.*;
import javax.swing.*;

public class Ejercicio1Beraliajovel {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primer JFrame");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Morena Gutierrez");
        JButton button = new JButton("Programacion III"); 
        
        panel.add(button);
        
        frame.setLocationRelativeTo(null);
        frame.add(label, BorderLayout.BEFORE_FIRST_LINE);
        frame.setSize(400, 150);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
