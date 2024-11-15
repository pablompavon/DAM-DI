import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class UD2_29_Foco {
    public static class FocoV extends JFrame implements WindowFocusListener{
        FocoV marco1;
        FocoV marco2;

        public void iniciar(){

            Toolkit pantalla=Toolkit.getDefaultToolkit();
            Dimension tamano=pantalla.getScreenSize();
            int alturaP=tamano.height;
            int anchoP=tamano.width;
            marco1=new FocoV();
            marco2=new FocoV();
            marco1.setVisible(true);
            marco2.setVisible(true);

            marco1.setSize(anchoP/2,alturaP/2);  
            marco1.setLocation(0,0);
            marco2.setSize(anchoP/2,alturaP/2);  
            marco2.setLocation(anchoP/2,0);

            //setBounds(500,300,250,250);
            marco1.setResizable(false);
            //setExtendedState(Frame.MAXIMIZED_BOTH);
            marco1.setTitle("Primera Ventana");
            marco2.setTitle("Segunda Ventana");
            marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco1.addWindowFocusListener(this);
            marco2.addWindowFocusListener(this);
        }

        public void windowGainedFocus(WindowEvent e){
            if(e.getSource()==marco1){
                marco1.setTitle("Marco 1 - Tiene foco.");
            }else if (e.getSource()==marco2){
                marco2.setTitle("Marco 2 - Tiene foco.");
            }
        }

        public void windowLostFocus(WindowEvent e){
            if(e.getSource()==marco1){
                marco1.setTitle("Marco 1");
            }else if (e.getSource()==marco2){
                marco2.setTitle("Marco 2");
            }
        }
        
    }
     
    public static void main(String[] args){
        FocoV vent=new FocoV();
        vent.iniciar();
    }
    
}

