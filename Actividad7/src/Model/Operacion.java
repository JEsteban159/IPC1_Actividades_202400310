package Model;

public class Operacion {
    private String tipo;
    private double numero1;
    private double numero2;
    private double resultado;

    public Operacion(String tipo, double numero1, double numero2, double resultado) {
        this.tipo = tipo;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s %.2f = %.2f", 
            numero1, getSimboloOperacion(), numero2, resultado);
    }

    private String getSimboloOperacion() {
        switch (tipo.toLowerCase()) {
            case "suma": return "+";
            case "resta": return "-";
            case "multiplicacion": return "*";
            case "division": return "/";
            default: return "?";
        }
    }
}