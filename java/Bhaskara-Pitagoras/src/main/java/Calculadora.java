import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora extends JPanel {
    // interface
    private JTabbedPane abas;
    private JPanel painelBhaskara, painelPitagoras;
    
    //Bhaskara
    private JTextField campoA, campoB, campoC;
    private JTextArea resultadoBhaskara;
    
    // Pitágoras
    private JRadioButton radioCatetos, radioHipotenusa;
    private JTextField campoLado1, campoLado2;
    private JTextArea resultadoPitagoras;
    
    public Calculadora() {
        setLayout(new BorderLayout());
        
        //painel de abas
        abas = new JTabbedPane();
        
        //aba de Bhaskara
        configurarBhaskara();
        abas.addTab("Bhaskara", painelBhaskara);
        
        //aba de Pitágoras
        configurarPitagoras();
        abas.addTab("Pitágoras", painelPitagoras);
        
        add(abas, BorderLayout.CENTER);
    }
    
    private void configurarBhaskara() {
        painelBhaskara = new JPanel(new GridLayout(5, 2, 5, 5));
        
        // entrada para os coeficientes
        painelBhaskara.add(new JLabel("Coeficiente a:"));
        campoA = new JTextField();
        painelBhaskara.add(campoA);
        
        painelBhaskara.add(new JLabel("Coeficiente b:"));
        campoB = new JTextField();
        painelBhaskara.add(campoB);
        
        painelBhaskara.add(new JLabel("Coeficiente c:"));
        campoC = new JTextField();
        painelBhaskara.add(campoC);
        
        // botão para calcular
        JButton calcularBhaskara = new JButton("Calcular Raízes");
        calcularBhaskara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularRaizesBhaskara();
            }
        });
        painelBhaskara.add(calcularBhaskara);
        
        // mostrar os resultados
        resultadoBhaskara = new JTextArea();
        resultadoBhaskara.setEditable(false);
        painelBhaskara.add(new JScrollPane(resultadoBhaskara));
    }
    
    private void calcularRaizesBhaskara() {
        try {
            //coeficientes da equação
            double a = Double.parseDouble(campoA.getText());
            double b = Double.parseDouble(campoB.getText());
            double c = Double.parseDouble(campoC.getText());
            
            //calcula o delta
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                resultadoBhaskara.setText("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                resultadoBhaskara.setText("A equação possui uma raiz real:\nX = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                resultadoBhaskara.setText("A equação possui duas raízes reais:\nX1 = " + raiz1 + "\nX2 = " + raiz2);
            }
        } catch (NumberFormatException ex) {
            resultadoBhaskara.setText("Por favor, insira valores numéricos válidos para todos os coeficientes.");
        }
    }
    
    private void configurarPitagoras() {
        painelPitagoras = new JPanel(new GridLayout(6, 2, 5, 5));
        
        //selecionar o cálculo
        ButtonGroup grupo = new ButtonGroup();
        radioCatetos = new JRadioButton("Calcular Hipotenusa", true);
        radioHipotenusa = new JRadioButton("Calcular Cateto");
        grupo.add(radioCatetos);
        grupo.add(radioHipotenusa);
        
        painelPitagoras.add(radioCatetos);
        painelPitagoras.add(radioHipotenusa);
        
        // lados
        painelPitagoras.add(new JLabel("Lado 1:"));
        campoLado1 = new JTextField();
        painelPitagoras.add(campoLado1);
        
        painelPitagoras.add(new JLabel("Lado 2:"));
        campoLado2 = new JTextField();
        painelPitagoras.add(campoLado2);
        
        // botão para calcular
        JButton calcularPitagoras = new JButton("Calcular");
        calcularPitagoras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPitagoras();
            }
        });
        painelPitagoras.add(calcularPitagoras);
        
        //resultados
        resultadoPitagoras = new JTextArea();
        resultadoPitagoras.setEditable(false);
        painelPitagoras.add(new JScrollPane(resultadoPitagoras));
    }
    
    private void calcularPitagoras() {
        try {
            double lado1 = Double.parseDouble(campoLado1.getText());
            double lado2 = Double.parseDouble(campoLado2.getText());
            
            if (radioCatetos.isSelected()) {
                // Calcula hipotenusa (lado1 e lado2 são catetos)
                double hipotenusa = Math.sqrt(lado1 * lado1 + lado2 * lado2);
                resultadoPitagoras.setText("Hipotenusa = " + hipotenusa);
            } else {
                // Calcula cateto (lado1 é hipotenusa, lado2 é cateto)
                if (lado1 <= lado2) {
                    resultadoPitagoras.setText("A hipotenusa deve ser maior que o cateto.");
                } else {
                    double cateto = Math.sqrt(lado1 * lado1 - lado2 * lado2);
                    resultadoPitagoras.setText("Cateto = " + cateto);
                }
            }
        } catch (NumberFormatException ex) {
            resultadoPitagoras.setText("Por favor, insira valores numéricos válidos para os lados.");
        }
    }
}