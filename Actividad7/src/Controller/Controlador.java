package Controller;

import Model.Usuario;
import Model.Operacion;
import View.*;

public class Controlador {
    private Usuario usuarioActual;
    private MenuUsuario menuUsuario;
    private MenuOpciones menuOpciones;
    private MenuSuma menuSuma;
    private MenuResta menuResta;
    private MenuMultiplicacion menuMultiplicacion;
    private MenuDivision menuDivision;
    private MenuHistorial menuHistorial;

    public Controlador() {
        this.menuOpciones = new MenuOpciones();
        configurarMenuOpciones();
    }
    
    public void setMenuUsuario(MenuUsuario menuUsuario) {
        this.menuUsuario = menuUsuario;
        configurarMenuUsuario();
    }
    
    private void configurarMenuUsuario() {
        menuUsuario.getSiguienteButton().addActionListener(e -> {
            String nombreUsuario = menuUsuario.getUsuarioText().getText().trim();
            
            if (!nombreUsuario.isEmpty()) {
                usuarioActual = new Usuario(nombreUsuario);

                menuOpciones.setTitle("Menú Principal - Usuario: " + nombreUsuario);
                
                menuUsuario.setVisible(false);
                menuOpciones.setLocationRelativeTo(null);
                menuOpciones.setVisible(true);
            } else {
                javax.swing.JOptionPane.showMessageDialog(menuUsuario, 
                    "Por favor ingrese un nombre de usuario", 
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    private void configurarMenuOpciones() {
        menuOpciones.getSumarButton().addActionListener(e -> abrirMenuSuma());
        menuOpciones.getRestarButton().addActionListener(e -> abrirMenuResta());
        menuOpciones.getMultiplicarButton().addActionListener(e -> abrirMenuMultiplicacion());
        menuOpciones.getDividirButton().addActionListener(e -> abrirMenuDivision());
        menuOpciones.getHistorialButton().addActionListener(e -> abrirMenuHistorial());
        menuOpciones.getRegresarButton().addActionListener(e -> regresarMenuUsuario());
    }
    
    private void abrirMenuSuma() {
        if (menuSuma == null) {
            menuSuma = new MenuSuma();
            configurarMenuSuma();
        }
        menuSuma.setTitle("Suma - Usuario: " + usuarioActual.getNombre());
        menuOpciones.setVisible(false);
        menuSuma.setLocationRelativeTo(null);
        menuSuma.setVisible(true);
    }
    
    private void abrirMenuResta() {
        if (menuResta == null) {
            menuResta = new MenuResta();
            configurarMenuResta();
        }
        menuResta.setTitle("Resta - Usuario: " + usuarioActual.getNombre());
        menuOpciones.setVisible(false);
        menuResta.setLocationRelativeTo(null);
        menuResta.setVisible(true);
    }
    
    private void abrirMenuMultiplicacion() {
        if (menuMultiplicacion == null) {
            menuMultiplicacion = new MenuMultiplicacion();
            configurarMenuMultiplicacion();
        }
        menuMultiplicacion.setTitle("Multiplicación - Usuario: " + usuarioActual.getNombre());
        menuOpciones.setVisible(false);
        menuMultiplicacion.setLocationRelativeTo(null);
        menuMultiplicacion.setVisible(true);
    }
    
    private void abrirMenuDivision() {
        if (menuDivision == null) {
            menuDivision = new MenuDivision();
            configurarMenuDivision();
        }
        menuDivision.setTitle("División - Usuario: " + usuarioActual.getNombre());
        menuOpciones.setVisible(false);
        menuDivision.setLocationRelativeTo(null);
        menuDivision.setVisible(true);
    }
    
    private void abrirMenuHistorial() {
        if (menuHistorial == null) {
            menuHistorial = new MenuHistorial();
            configurarMenuHistorial();
        }
        menuHistorial.actualizarHistorial(usuarioActual);
        menuHistorial.setTitle("Historial - Usuario: " + usuarioActual.getNombre());
        menuOpciones.setVisible(false);
        menuHistorial.setLocationRelativeTo(null);
        menuHistorial.setVisible(true);
    }
    
    private void configurarMenuSuma() {
        menuSuma.getRegresarButton().addActionListener(e -> regresarMenuOpciones());
        menuSuma.getCalcularButton().addActionListener(e -> calcularSuma());
    }
    
    private void configurarMenuResta() {
        menuResta.getRegresarButton().addActionListener(e -> regresarMenuOpciones());
        menuResta.getCalcularButton().addActionListener(e -> calcularResta());
    }
    
    private void configurarMenuMultiplicacion() {
        menuMultiplicacion.getRegresarButton().addActionListener(e -> regresarMenuOpciones());
        menuMultiplicacion.getCalcularButton().addActionListener(e -> calcularMultiplicacion());
    }
    
    private void configurarMenuDivision() {
        menuDivision.getRegresarButton().addActionListener(e -> regresarMenuOpciones());
        menuDivision.getCalcularButton().addActionListener(e -> calcularDivision());
    }
    
    private void configurarMenuHistorial() {
        menuHistorial.getRegresarButton().addActionListener(e -> regresarMenuOpciones());
    }
    
    private void calcularSuma() {
        try {
            double num1 = Double.parseDouble(menuSuma.getNum1Text().getText());
            double num2 = Double.parseDouble(menuSuma.getNum2Text().getText());
            double resultado = num1 + num2;
            
            Operacion operacion = new Operacion("suma", num1, num2, resultado);
            usuarioActual.agregarOperacion(operacion);
            
            menuSuma.getResultadoText().setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            mostrarError(menuSuma, "Por favor ingrese números válidos");
        }
    }
    
    private void calcularResta() {
        try {
            double num1 = Double.parseDouble(menuResta.getNum1Text().getText());
            double num2 = Double.parseDouble(menuResta.getNum2Text().getText());
            double resultado = num1 - num2;
            
            Operacion operacion = new Operacion("resta", num1, num2, resultado);
            usuarioActual.agregarOperacion(operacion);
            
            menuResta.getResultadoText().setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            mostrarError(menuResta, "Por favor ingrese números válidos");
        }
    }
    
    private void calcularMultiplicacion() {
        try {
            double num1 = Double.parseDouble(menuMultiplicacion.getNum1Text().getText());
            double num2 = Double.parseDouble(menuMultiplicacion.getNum2Text().getText());
            double resultado = num1 * num2;
            
            Operacion operacion = new Operacion("multiplicacion", num1, num2, resultado);
            usuarioActual.agregarOperacion(operacion);
            
            menuMultiplicacion.getResultadoText().setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            mostrarError(menuMultiplicacion, "Por favor ingrese números válidos");
        }
    }
    
    private void calcularDivision() {
        try {
            double num1 = Double.parseDouble(menuDivision.getNum1Text().getText());
            double num2 = Double.parseDouble(menuDivision.getNum2Text().getText());
            
            if (num2 == 0) {
                mostrarError(menuDivision, "No se puede dividir entre cero");
                return;
            }
            
            double resultado = num1 / num2;
            
            Operacion operacion = new Operacion("division", num1, num2, resultado);
            usuarioActual.agregarOperacion(operacion);
            
            menuDivision.getResultadoText().setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            mostrarError(menuDivision, "Por favor ingrese números válidos");
        }
    }
    
    private void mostrarError(javax.swing.JFrame parent, String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(parent, mensaje, "Error", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    private void regresarMenuOpciones() {
        if (menuSuma != null && menuSuma.isVisible()) menuSuma.setVisible(false);
        if (menuResta != null && menuResta.isVisible()) menuResta.setVisible(false);
        if (menuMultiplicacion != null && menuMultiplicacion.isVisible()) menuMultiplicacion.setVisible(false);
        if (menuDivision != null && menuDivision.isVisible()) menuDivision.setVisible(false);
        if (menuHistorial != null && menuHistorial.isVisible()) menuHistorial.setVisible(false);
        
        menuOpciones.setLocationRelativeTo(null);
        menuOpciones.setVisible(true);
    }
    
    private void regresarMenuUsuario() {
        menuOpciones.setVisible(false);
        menuUsuario.getUsuarioText().setText("");
        menuUsuario.setLocationRelativeTo(null);
        menuUsuario.setVisible(true);
    }
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
}