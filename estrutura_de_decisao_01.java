import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

/*
Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros
para receber um para receber a nota de português e outro para receber as de matemática.
A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59
em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá
a vaga.
No final mostre para o candidato se ele conseguiu ou não.
 */

public class estrutura_de_decisao_01 {
    static final int NotaMinima = 60;
    static final int NotaParaPassarDeAno = 150;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("POR FAVOR, INFORME SUA PRIMEIRA NOTA DE PORTUGUÊS: ");
        Float notaDePortugues = scanner.nextFloat();
        System.out.print("AGORA, INFORME SUA NOTA DE MATEMATICA: ");
        Float notaDeMatematica = scanner.nextFloat();
        Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NotaMinima;
        Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NotaMinima;
        float notaTotal = notaDePortugues + notaDeMatematica;
        Boolean temNotaParaPassar = notaTotal >= NotaParaPassarDeAno;
        Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;
        if (passou) {
            System.out.println("Parabéns! Você passou.");
        } else {
            System.out.println("Infelizmente, não foi dessa vez.");
        }
        scanner.close();
    }
}


