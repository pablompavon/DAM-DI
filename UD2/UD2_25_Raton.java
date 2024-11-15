import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class UD2_25_Raton {
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
            addMouseListener(new Raton());

        }
        
    }

    public static class Raton implements MouseListener{

        public void mouseClicked(MouseEvent e) {
            System.out.println("Se ha hecho click.");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("Se ha presionado el ratón.");

        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Se ha soltado el ratón.");

        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("Se ha entrado en un elemento.");

        }

        public void mouseExited(MouseEvent e) {
            System.out.println("Se ha salido de un elemento");

        }
    
    }
 
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

