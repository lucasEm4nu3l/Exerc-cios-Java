package Média;

import java.util.Scanner;

public class MediaMain {

    public static void main(String[] args) {
        int repetir = 0;
        Media m = new Media();
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int total;

        do {

                    System.out.println("Calculando as Médias dos alunos");
                    new Scanner(System.in);

                    System.out.println("Sua Média: ");
                    new Scanner(System.in);

                    System.out.println("Nota 1: ");
                    n1 = sc.nextInt();

                    System.out.println("Nota 2: ");
                    n2 = sc.nextInt();

                    System.out.println(total =(m.media(n1, n2)));

                if (total >= 70){
                    System.out.println("APROVADO!");
                }

                else if (total >= 41){
                    System.out.println("REPROVADO!!!");
                }

                if ( total <= 40){
                    System.out.println("ESTÁ NA FINAL!!!");
                }

            System.out.println("Se deseja ver uma próxima média, Digite 0");
            repetir = sc.nextInt();
        }while (repetir == 0);
    }
}
