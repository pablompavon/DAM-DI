import javax.swing.JFrame;

public class UD2_1_JFrame {
    public static class miMarco extends JFrame{
        public miMarco(){
            setSize(500,300);  
            setLocation(500,300);
        }
    }

    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

