import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class UD2_27_Raton {
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
            addMouseMotionListener(new Raton());

        }
        
    }

    public static class Raton implements  MouseMotionListener{

        public void mouseDragged(MouseEvent e) {

            System.out.println("Estás arrastrando.");

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Estás moviendo.");
        }
  
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

