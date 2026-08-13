// Clase con métodos sobrecargados
class Area {

    // Método 1: Calcula el área de un cuadrado (1 parámetro)
    public double calcular(double lado) {
        return lado * lado;
    }

    // Método 2: Calcula el área de un rectángulo (2 parámetros)
    public double calcular(double base, double altura) {
        return base * altura;
    }
}

// Clase Principal para ejecutar la prueba
public class Main {
    public static void main(String[] args) {
        Area area = new Area();

        // Llama al método de 1 parámetro (Cuadrado)
        double areaCuadrado = area.calcular(5.0);
        System.out.println("Área del cuadrado: " + areaCuadrado);

        // Llama al método de 2 parámetros (Rectángulo)
        double areaRectangulo = area.calcular(4.0, 6.0);
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }
}