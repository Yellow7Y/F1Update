import java.util.Scanner;
public class Exercio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int diasDeTrabalhoNoMes = 22;
    System.out.print("Quanto voce ganha por hora?");
    Double salarioHora = scanner.nextDouble();
    System.out.println("Quantas horas voce trabalha por dia");
    Double horasTrabalhadasDia = scanner.nextDouble();
    double salarioDia = salarioHora * horasTrabalhadasDia;
    double salarioMes = (salarioDia * diasDeTrabalhoNoMes);
    System.out.println("Total de salario no mes: " + salarioMes);
    scanner.close();
    }
}