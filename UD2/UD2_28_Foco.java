import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UD2_28_Foco {
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
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(new Lamina());
        }
        
    }

    public static class Lamina extends  JPanel{
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setLayout(null);
            JTextField cuadro1=new JTextField();
            JTextField cuadro2=new JTextField();
            cuadro1.setBounds(200,50,40,50);
            cuadro2.setBounds(200,100,40,50);
            add(cuadro1);
            add(cuadro2);
            Focos foco=new Focos();
            cuadro1.addFocusListener(foco);
        }

        private class Focos implements FocusListener{


            public void focusGained(FocusEvent e) {
                System.out.println("Foco Ganado - "+e.getComponent().getClass());

                
            }

            public void focusLost(FocusEvent e) {
                System.out.println("Foco Perdido - "+e.getComponent().getName());

            }
            
        }
  
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

