package actividad7;

import Controller.Controlador;
import View.MenuUsuario;

public class Actividad7 {
    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuUsuario menuUsuario = new MenuUsuario();
                menuUsuario.setLocationRelativeTo(null);
                menuUsuario.setVisible(true);
                
                controlador.setMenuUsuario(menuUsuario);
            }
        });
    }
}