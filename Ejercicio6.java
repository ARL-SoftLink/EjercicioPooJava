// Clase Padre (Superclase)
class Animal {
    protected String nombre;

    // Constructor de Animal que recibe el nombre
    public Animal(String nombre) {
        this.nombre = nombre;
    }
}

// Clase Hija (Subclase)
class Gato extends Animal {

    // Constructor de Gato que recibe el nombre y se lo pasa a Animal
    public Gato(String nombre) {
        super(nombre); // OBLIGATORIO: Primera línea del constructor
    }

    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

// Clase Principal para ejecutar la prueba
public class Main {
    public static void main(String[] args) {
        Gato miGato = new Gato("Felix");
        miGato.maullar(); // Imprime: Felix dice: ¡Miau!
    }
}