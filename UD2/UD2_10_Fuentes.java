
import java.awt.GraphicsEnvironment;

public class UD2_10_Fuentes {
    public static void main(String[] args) {
        String [] nombresFuentes =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String nombre: nombresFuentes){
            System.out.println(nombre);
        }
    }
}
