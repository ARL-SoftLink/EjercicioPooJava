// Clase abstracta base
abstract class Figura {
    // Método abstracto (sin cuerpo, las subclases deben implementarlo obligatoriamente)
    public abstract double calcularArea();
}

// Subclase Circulo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Subclase Cuadrado
class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Clase Principal para ejecutar la prueba
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3);
        Figura cuadrado = new Cuadrado(5);

        System.out.println("Area circulo: " + circulo.calcularArea());
        System.out.println("Area cuadrado: " + cuadrado.calcularArea());
    }
}