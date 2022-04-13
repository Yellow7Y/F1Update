import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tamanho do peixe: ");
        Double peixe  = scanner.nextDouble();

        if(peixe >50){
           
        Double excesso = peixe - 50;
        Double valor =excesso * 4;
        System.out.println("á multa que ele tem que pagar é: " + valor);


        scanner.close();
        }
    }
}
