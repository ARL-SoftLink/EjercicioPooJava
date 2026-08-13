/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author MINEDUCYT
 */
public class Rectangulo {
    // Atributos privados (aunque en este ejercicio no se pide encapsular, pero es buena práctica)
    private double base;
    private double altura;

    // Constructor que recibe base y altura y los asigna usando 'this'
    public Rectangulo(double base, double altura) {
        this.base = base;   // this.base se refiere al atributo, base al parámetro
        this.altura = altura;
    }

    // Método que calcula y devuelve el área
    public double area() {
        return base * altura;   // Multiplica base por altura y retorna el resultado
    }
}
