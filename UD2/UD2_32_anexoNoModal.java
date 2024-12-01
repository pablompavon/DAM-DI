import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class UD2_32_anexoNoModal {

    public static class VentanaPrincipal extends JFrame {
    
        public VentanaPrincipal() {
            // Configuración básica de la ventana principal
            setTitle("Ventana Principal");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            // Botón que abre el diálogo no modal
            JButton btnMostrarDialogo = new JButton("Abrir Diálogo No Modal");
            btnMostrarDialogo.addActionListener(e -> abrirDialogoNoModal());
            
            add(btnMostrarDialogo, BorderLayout.CENTER);
        }
    
        private void abrirDialogoNoModal() {
            // Crear un JDialog sin modalidad
            JDialog dialogo = new JDialog(this, "Diálogo No Modal", false);
            dialogo.setSize(200, 150);
            dialogo.setLocationRelativeTo(this);
            
            // Agregar un botón para cerrar el diálogo
            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.addActionListener(e -> dialogo.dispose());
            dialogo.add(btnCerrar, BorderLayout.CENTER);
            
            dialogo.setVisible(true); // Mostrar el diálogo sin bloqueo
        }

    }
    public static void main(String[] args) {
        new VentanaPrincipal().setVisible(true);
    }
}