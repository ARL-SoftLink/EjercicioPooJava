/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author MINEDUCYT
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /***
        // EJERCICIO 1: Crear un objeto Mascota y llamar a describir()
        ejercicio1 m = new ejercicio1();  // Se crea una instancia de Mascota
        m.nombre = "Firulais";      // Se asigna el nombre
        m.especie = "Perro";        // Se asigna la especie
        m.describir();              // Se invoca el método describir()
        // Salida esperada: Nombre: Firulais, Especie: Perro
        * ***/
        /**
         // EJERCICIO 2: Crear un rectángulo con base 5 y altura 4 e imprimir su área
        Rectangulo r = new Rectangulo(5.0, 4.0); // Se instancia con el constructor
        double area = r.area();                  // Se calcula el área
        System.out.println("Área: " + area);     // Se muestra: Área: 20.0
        * **/
        /*****
         // EJERCICIO 3: Crear una cuenta, depositar 100 y luego -20
        Cuenta c = new Cuenta();        // Se crea la cuenta (saldo inicial 0)
        c.depositar(100);               // Depósito válido
        c.depositar(-20);               // Depósito inválido (no modifica el saldo)
        System.out.println("Saldo: " + c.getSaldo()); // Saldo: 100.0
        * **/
        
        /***
         // EJERCICIO 4: Probar setEdad con 25 y con -3
        Persona p = new Persona();
        p.setEdad(25);          // Edad válida, se asigna
        System.out.println("Edad: " + p.getEdad()); // Muestra 25
        p.setEdad(-3);          // Edad inválida, imprime "Edad invalida"
        System.out.println("Edad: " + p.getEdad()); // Sigue siendo 25
        * **/
        
          // EJERCICIO 5: Crear un Gato y llamar a dormir() y maullar()
        Gato g = new Gato();    // Se crea un objeto Gato
        g.dormir();             // Método heredado de Animal
        g.maullar();            // Método propio de Gato
    }
    
}
