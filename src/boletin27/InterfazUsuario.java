
package boletin27;

import javax.swing.*;


public class InterfazUsuario {
    
    JFrame marco;
    JPanel panel, panel2;
    JLabel nome, password, elementosLista;
    JButton premer, limpar, boton3;
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
        
        panel2 = new JPanel();
        elementosLista = new JLabel("<html>Elenento 1<p>Elemento 2<p>Elemento 3</html>");
        boton3 = new JButton("BOTON");
        area = new JTextArea("Area de texto");
        
        
        
        marco.setSize(750, 800);
        marco.setLayout(null);
        
        panel2.setBounds(0, 300, 650, 300);
        panel2.setLayout(null);
        elementosLista.setBounds(150, 0, 75, 150);
        boton3.setBounds(235, 50, 150, 50);
        area.setBounds(400, 50, 200, 200);
        panel2.add(elementosLista);
        panel2.add(boton3);
        panel2.add(area);
        
        
        
        
        marco.setLocationRelativeTo(null);
        panel.setLayout(null);
        panel.setSize(650, 300);
        nome.setBounds(150, 60, 75, 50);
        nome.setText("NOME");
        t_nome.setBounds(300, 60, 300, 50);
        password.setBounds(150, 160, 70, 65);
        password.setText("PASSWORD");
        t_password.setBounds(300, 160, 300, 50);
        premer.setBounds(150, 250, 200, 50);
        premer.setText("PREMER");
        limpar.setBounds(400, 250, 200, 50);
        limpar.setText("LIMAR");
        
        
        
        panel.add(nome);
        panel.add(t_nome);
        panel.add(password);
        panel.add(t_password);
        panel.add(premer);
        panel.add(limpar);
        marco.add(panel);
        marco.add(panel2);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }   
    
}