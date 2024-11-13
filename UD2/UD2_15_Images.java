import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UD2_15_Images {
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

            Lamina lamina = new Lamina(pantalla);
            add(lamina);
        }
    }

    static class Lamina extends JPanel{
        private Image imagen;
        private Toolkit toolkit;
        public Lamina(Toolkit _toolkit){
                 try{
                imagen=ImageIO.read(new File("java.bmp"));

            }catch(IOException e){
                System.out.println("No se encuentra la imagen.");
            }

            toolkit=_toolkit;
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            imagen=imagen.getScaledInstance(150, 150, 0);
            g.drawImage(imagen, 5, 5, null);
             
            for(int i=0; i<toolkit.getScreenSize().getWidth();i++){
                for(int j=0; j<toolkit.getScreenSize().getHeight();j++){
                    g.copyArea(5, 5, imagen.getWidth(this), imagen.getHeight(this), imagen.getWidth(this)*i,imagen.getHeight(this)*j);
                }
            }
                   }
    }
    
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

