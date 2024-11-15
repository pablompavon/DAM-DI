import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class UD2_24_Teclado {
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

    public static class Teclado implements KeyListener{
        public void keyPressed(KeyEvent e){
            int codigo=e.getKeyCode();
            int valor=e.getKeyChar();
            System.out.println("Teclado pulsado. Código: "+ codigo+" - Valor: "+ valor);
        }

        public void keyTyped(KeyEvent e) {
            int tecla=e.getKeyChar();
            System.out.println("Carácter pulsado. Valor: "+ tecla);
        }

        public void keyReleased(KeyEvent e) {
        
        }
    
    }
 
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

