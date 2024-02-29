package Calculadora;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        int repetir = 0;
        Calculadora c = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;

        do {

            System.out.println("Caso escolha 1; Quais os números para a soma?\n" +
                    "Caso escolha 2; Quais os números para subtrair?\n" +
                    "Caso escolha 3; Quais os números para dividir?\n" +
                    "Caso escolha 4; Quais os números para multiplicar?\n");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    System.out.println("Cálculo: ");
                    new Scanner(System.in);
                    System.out.println("Número 1: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Número 2: ");
                    n2 = scanner.nextDouble();
                    System.out.println(c.somar(n1,n2));
                    break;

                case 2:
                    System.out.println("Cálculo: ");
                    new Scanner(System.in);
                    System.out.println("Número 1: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Número 2: ");
                    n2 = scanner.nextDouble();
                    System.out.println(c.subtrair(n1,n2));
                    break;

                case 3:
                    System.out.println("Cálculo: ");
                    new Scanner(System.in);
                    System.out.println("Número 1: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Número 2: ");
                    n2 = scanner.nextDouble();
                    System.out.println(c.dividir(n1,n2));
                    break;

                case 4:
                    System.out.println("Cálculo: ");
                    new Scanner(System.in);
                    System.out.println("Número 1: ");
                    n1 = scanner.nextDouble();
                    System.out.println("Número 2: ");
                    n2 = scanner.nextDouble();
                    System.out.println(c.multiplicar(n1,n2));
                    break;

            }
            System.out.println("Se Deseja Repetir, Digite 0: ");
            repetir = scanner.nextInt();
        }while(repetir == 0);


    }
}

