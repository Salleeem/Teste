package Revisão;

import java.util.Scanner;

public class ExRevisão {
    Scanner sc = new Scanner(System.in);

    public void Ex1() {
        System.out.println("Informe a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é " + media);
        System.out.println("Informe o total de aulas");
        double aulasDadas = sc.nextDouble();
        System.out.println("Informe a quantidade de faltas do aluno");
        double faltas = sc.nextDouble();
        double ap = (aulasDadas - faltas) * 100 / aulasDadas;
        System.out.println("A frequência desse aluno é de " + ap);
        if (ap >= 75 && media >= 50) {
            System.out.println("O aluno está aprovado");

        } else {
            System.out.println("O aluno está reprovado");

        }

    }

}
