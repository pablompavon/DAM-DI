import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class UD2_22_Ventana {
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
            addWindowStateListener(new Estado());


        }
        
    }

    public static class Estado implements WindowStateListener{
        public void windowStateChanged(WindowEvent e){
            int estadoActual = e.getNewState();
            int estadoAnterior = e.getOldState();
            System.out.println("Ventana ha cambiado. - Estado anterior: "+estadoAnterior+" - Estado actual: "+estadoActual);
            
            if (estadoActual==Frame.MAXIMIZED_BOTH){
                System.out.println("Se ha maximizado la ventana");
            }else if(estadoActual==Frame.ICONIFIED){
                System.out.println("Se ha minimizado la ventana");
            }else if(estadoActual==Frame.NORMAL){
                System.out.println("La ventana está a un tamaño normal");
            }else{
                System.out.println("Adivina, adivinanza, en que estado está la pantalla? ... "+estadoActual);
            }
        }
    
    }


  
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
    }
    
}

