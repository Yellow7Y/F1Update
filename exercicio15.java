import java.util.Scanner;


public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite Quanto voce ganha por hora");
        Double salarioHora = scanner.nextDouble();

        System.out.println("Digite o números de horas trabalhadas no mes: ");
        Double horasTrabalhadasNoMes = scanner.nextDouble();

        double salarioMes = horasTrabalhadasNoMes * salarioHora;
        double impostoRenda =salarioMes * .11;
        double inss = salarioMes * .8;
        double sindicato = salarioMes * .5;



        System.out.println("Seu salario bruto: "+salarioMes);
        System.out.println("Voce pagou ao ir "+impostoRenda);
        System.out.println("voce pagou ao inss "+inss);
        System.out.println("Voce pagou ao sindicato "+sindicato);


        scanner.close();
    }


}
