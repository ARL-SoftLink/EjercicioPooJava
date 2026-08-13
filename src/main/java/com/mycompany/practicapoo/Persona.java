/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author MINEDUCYT
 */
public class Persona {
    // Atributo privado edad
    private int edad;

    // Setter con validación: rechaza edades negativas
    public void setEdad(int edad) {
        if (edad >= 0) {                // Si la edad es válida (no negativa)
            this.edad = edad;           // Se asigna al atributo
        } else {
            System.out.println("Edad invalida"); // Mensaje de error
        }
    }

    // Getter para obtener la edad (opcional, pero útil)
    public int getEdad() {
        return edad;
    }
}
