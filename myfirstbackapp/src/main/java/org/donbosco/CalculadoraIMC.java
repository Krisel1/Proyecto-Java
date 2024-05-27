package org.donbosco;

// Utilizando  Scanner; permite al usuario ingresar su peso y altura
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = calcularIMC(peso, altura);

        // Mostrar el resultado y la descripción
        System.out.printf("Su IMC es: %.2f%n", imc);
        System.out.println(describirIMC(imc));

    scanner.close();
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para describir el IMC
    public static String describirIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 17) {
            return "Delgadez moderada";
        } else if (imc >= 18.5) {
            return "Delgadez leve";
        } else if (imc >= 25) {
            return "Peso normal";
        } else if (imc >= 30) {
            return "Sobrepeso";
        } else if (imc >= 35) {
            return "Obesidad leve";
        } else if (imc >= 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad morbida";
        }
    }
}

