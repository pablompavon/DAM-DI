import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UD2_18_Button {
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


    static class Lamina extends JPanel{
        JButton boton = new JButton("Blanco");
        JButton boton2 = new JButton("Azul");
        JButton boton3 = new JButton("Rojo");

        public Lamina(){
            add(boton);
            add(boton2);
            add(boton3);

            Fondo blanco = new Fondo(Color.white);
            Fondo azul = new Fondo(Color.blue);
            Fondo rojo = new Fondo(Color.red);

            boton.addActionListener(blanco);
            boton2.addActionListener(azul);
            boton3.addActionListener(rojo);

        }
        private class Fondo implements ActionListener{
            private Color fondo;
            public Fondo(Color c){
                fondo=c;
            }
            public void actionPerformed(ActionEvent e){
                setBackground(fondo);
            }
        }
                   
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

