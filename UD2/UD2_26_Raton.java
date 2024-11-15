import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class UD2_26_Raton {
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

    public static class Raton extends MouseAdapter{

        public void mouseClicked(MouseEvent e) {
            int x=e.getX();
            int y=e.getY();
            System.out.println("Se ha hecho click. - Coordenada X: "+x+" - Coordenada Y: "+y);
            if(e.getButton()==MouseEvent.BUTTON1){
                System.out.println("Has pulsado el botón izquierdo");
            }else if (e.getButton()==MouseEvent.BUTTON3){
                System.out.println("Has pulsado el botón derecho");
            }else{
                System.out.println("Has hecho otra cosa");
            }
        }

    
    
    }
 
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

