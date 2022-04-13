import java.util.Scanner;

public class execercicio5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite Tamanho da arvore em metros");
        Double metros = scanner.nextDouble();



        System.out.println("O cm da arvore é: " + metros*100 + " Cemtimetros");

        scanner.close();
    }
}
