import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class UD2_23_Teclado {
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
            addKeyListener(new Teclado());


        }
        
    }

    public static class Teclado extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int codigo=e.getKeyCode();
            System.out.println("Teclado pulsado. Código: "+ codigo);
        }
    
    }
 
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

