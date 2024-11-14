import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class UD2_20_Ventana {
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
            addWindowListener(new MVentana());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }
        
    }

    public static class MVentana extends WindowAdapter{
        public void windowActivated(WindowEvent e){
            System.out.println("Ventana activada.");
        }
        public void windowDeactivated(WindowEvent e){
            System.out.println("Ventana desactivada.");

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
    }
    
}

