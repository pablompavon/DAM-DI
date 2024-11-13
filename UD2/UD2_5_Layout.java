import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UD2_5_Layout {
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

            setLayout(new BorderLayout());

            // Crear botones para cada región
            JButton btnNorte = new JButton("Norte");
            JButton btnSur = new JButton("Sur");
            JButton btnEste = new JButton("Este");
            JButton btnOeste = new JButton("Oeste");
            JButton btnCentro = new JButton("Centro");

            // Añadir los botones a las regiones correspondientes
            add(btnNorte, BorderLayout.NORTH);
            add(btnSur, BorderLayout.SOUTH);
            add(btnEste, BorderLayout.EAST);
            add(btnOeste, BorderLayout.WEST);
            add(btnCentro, BorderLayout.CENTER);
                        
        }
    }

    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

