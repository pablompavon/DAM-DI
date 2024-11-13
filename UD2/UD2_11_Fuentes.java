
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class UD2_11_Fuentes {
    public static void main(String[] args) {
        String fuente=JOptionPane.showInputDialog("Introduce fuente:");
        String [] nombresFuentes =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        boolean disponible = false;
        for(String nombre: nombresFuentes){
            if(nombre == null ? fuente == null : nombre.equals(fuente)){
                disponible=true;
            }
        }

        if(disponible){
            System.out.println("Fuente Instalada - " + fuente);
        }else{
            System.out.println("Fuente No Instalada - " + fuente);
        }
    }
}
