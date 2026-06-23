import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BhaskaraPitagoras {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculadora Bhaskara e Pitágoras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        
        Calculadora calculadora = new Calculadora();
        frame.add(calculadora);
        
        frame.setVisible(true);
    }
}

