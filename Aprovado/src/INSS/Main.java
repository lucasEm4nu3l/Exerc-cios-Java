package INSS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String repetir;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        do {

            Pessoa p = new Pessoa();

            System.out.println("Qual a Mátricula?: ");
            int matricula = scanner1.nextInt();

            System.out.println("Informe seu Nome Completo: ");
            String nome = scanner.nextLine();

            System.out.println("Qual o seu Salário Bruto?: ");
            double salario = scanner1.nextDouble();


            double inss = salario * 15 / 100;
            System.out.println("Dedução de INSS: " + inss);


            double s_liquido = salario - salario * 15 / 100;
            System.out.println("Seu Salário Líquido: " + s_liquido);

            System.out.println("Deseja cadastrar outra pessoa? ");

            repetir = scanner.nextLine();
        }while(repetir.equalsIgnoreCase("S"));
    }

}