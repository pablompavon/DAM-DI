import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class UD2_31_anexoModal {

    public static class VentanaPrincipal extends JFrame {
        
        public VentanaPrincipal() {
            // Configuración básica de la ventana principal
            setTitle("Ventana Principal");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            // Botón que abre el diálogo modal
            JButton btnMostrarDialogo = new JButton("Abrir Diálogo Modal");
            btnMostrarDialogo.addActionListener(e -> abrirDialogoModal());
            
            add(btnMostrarDialogo, BorderLayout.CENTER);
        }

        private void abrirDialogoModal() {
            // Crear un JDialog con modalidad
            JDialog dialogo = new JDialog(this, "Diálogo Modal", true);
            dialogo.setSize(200, 150);
            dialogo.setLocationRelativeTo(this);
            
            // Agregar un botón para cerrar el diálogo
            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.addActionListener(e -> dialogo.dispose());
            dialogo.add(btnCerrar, BorderLayout.CENTER);
            
            dialogo.setVisible(true); // Mostrar el diálogo de manera modal
        }

        

    }

    public static void main(String[] args) {
        new VentanaPrincipal().setVisible(true);
    }
}