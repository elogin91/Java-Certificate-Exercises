package textArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextArea3 extends JFrame implements ActionListener{
	private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;
    public TextArea3() {
    	setLayout(null);
        textarea1=new JTextArea();
        scrollpane1=new JScrollPane(textarea1);
        scrollpane1.setBounds(10,10,300,200);
        add(scrollpane1);
        boton1=new JButton("Verificar");
        boton1.setBounds(10,260,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String texto=textarea1.getText();
            if (texto.indexOf("argentina")!=-1) {
                setTitle("Si contiene el texto \"argentina\"");
            } else {
                setTitle("No contiene el texto \"argentina\"");            
            }
        }
    }
    
    public static void main(String[] ar) {
    	TextArea3 form=new TextArea3();
        form.setBounds(0,0,540,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
