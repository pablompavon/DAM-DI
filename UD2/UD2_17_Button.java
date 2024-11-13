import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UD2_17_Button {
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
        JButton boton2 = new JButton("Amarillo");
        JButton boton3 = new JButton("Rojo");

        public Lamina(){
            add(boton);
            add(boton2);
            add(boton3);

            boton.addActionListener(this);
            boton2.addActionListener(this);
            boton3.addActionListener(this);

        }
        public void actionPerformed(ActionEvent e){
            Object pulsado =e.getSource();
            if (pulsado==boton){
                setBackground(Color.BLUE);
            }else if(pulsado==boton2){
                setBackground(Color.YELLOW);
            }else{
                setBackground(Color.RED);
            }
        }                
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

