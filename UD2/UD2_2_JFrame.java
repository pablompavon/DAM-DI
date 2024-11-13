import java.awt.Frame;
import javax.swing.JFrame;

public class UD2_2_JFrame {
    public static class miMarco extends JFrame{
        public miMarco(){
            //setSize(500,300);  
            //setLocation(500,300);
            setBounds(500,300,250,250);
            //setResizable(false);
            setExtendedState(Frame.MAXIMIZED_BOTH);
            setTitle("Primera Ventana");
        }
    }

    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

