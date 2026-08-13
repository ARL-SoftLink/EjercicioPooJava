class Empleado {

    // Método base que calcula el bono estándar
    public int calcularBono() {
        return 100;
    }
}
class Gerente extends Empleado {

    // Sobrescritura del método de la clase padre
    @Override
    public int calcularBono() {
        return 500;
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        Gerente ger = new Gerente();

        System.out.println("Bono empleado: " + emp.calcularBono());
        System.out.println("Bono gerente: " + ger.calcularBono());
    }
}