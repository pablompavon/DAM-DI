import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UD2_16_Button {
    public static class miMarco extends JFrame{
        public miMarco(){

            Toolkit pantalla=Toolkit.getDefaultToolkit();
            Dimension tamano=pantalla.getScreenSize();
            int alturaP=tamano.height;
            int anchoP=tamano.width;

            setSize(anchoP/3,alturaP/3);  
            setLocation(anchoP/3,alturaP/3);
            //setBounds(500,300,250,250);
            //setResizable(false);
            //setExtendedState(Frame.MAXIMIZED_BOTH);
            setTitle("Primera Ventana");

            Lamina lamina = new Lamina();
            add(lamina);
        }
    }


    static class Lamina extends JPanel implements ActionListener{
        JButton boton = new JButton("Azul");
        public Lamina(){
            add(boton);
            boton.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e){
            if ("Azul".equals(boton.getText())){
                setBackground(Color.BLUE);
                boton.setText("Verde");
            }
            else{
                setBackground(Color.GREEN);
                boton.setText("Azul");
            }
        }   
                   
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

