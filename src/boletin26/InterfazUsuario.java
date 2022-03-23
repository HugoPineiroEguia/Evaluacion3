
package boletin26;

import javax.swing.*;


public class InterfazUsuario {
    
    JFrame marco;
    JPanel panel;
    JLabel nome, password;
    JButton premer, limpar;
    JTextField t_nome, t_password;
    JTextArea area;
    
    public void crearInterfaz(){
        
        
        marco = new JFrame();
        panel = new JPanel();
        nome = new JLabel();
        password = new JLabel();
        t_nome = new JTextField();
        t_password = new JTextField();
        premer = new JButton();
        limpar = new JButton();
        area = new JTextArea("Area de texto");
        
        
        
        
        marco.setSize(750, 750);
        marco.setLocationRelativeTo(null);
        panel.setLayout(null);
        panel.setSize(650, 650);
        nome.setBounds(150, 60, 75, 50);
        nome.setText("NOME");
        t_nome.setBounds(300, 60, 300, 50);
        password.setBounds(150, 160, 70, 65);
        password.setText("PASSWORD");
        t_password.setBounds(300, 160, 300, 50);
        area.setBounds(150, 250, 450, 250);
        premer.setBounds(150, 535, 200, 50);
        premer.setText("PREMER");
        limpar.setBounds(400, 535, 200, 50);
        limpar.setText("LIMAR");
        
        
        
        panel.add(nome);
        panel.add(t_nome);
        panel.add(password);
        panel.add(t_password);
        panel.add(area);
        panel.add(premer);
        panel.add(limpar);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }   
    
}
