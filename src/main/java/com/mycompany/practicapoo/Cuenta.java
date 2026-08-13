/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author MINEDUCYT
 */
public class Cuenta {
    // Atributo privado: saldo
    private double saldo;

    // Getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método depositar: solo acepta montos mayores que 0
    public void depositar(double m) {
        if (m > 0) {                // Si el monto es positivo
            saldo = saldo + m;      // Se suma al saldo
        } else {
            System.out.println("Monto inválido para depósito");
        }
    }
}
