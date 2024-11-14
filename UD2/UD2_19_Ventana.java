import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class UD2_19_Ventana {
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
            MVentana oyente = new MVentana();
            addWindowListener(oyente);

        }
        
    }

    public static class MVentana implements WindowListener{
        public void windowActivated(WindowEvent e){
            System.out.println("Ventana activada.");
        }
        public void windowDeactivated(WindowEvent e){
            System.out.println("Ventana desactivada.");

        }
        public void windowOpened(WindowEvent e){
            System.out.println("Ventana abierta.");

        }
        public void windowClosed(WindowEvent e){
            System.out.println("Ventana cerrada.");

        }
        public void windowClosing(WindowEvent e){
            System.out.println("Ventana cerrando.");

        }
        public void windowIconified(WindowEvent e){
            System.out.println("Ventana minimizada.");

        }
        public void windowDeiconified(WindowEvent e){
            System.out.println("Ventana desminimizada.");

        }
    }


  
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

