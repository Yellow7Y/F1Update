import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado :");

        Integer lado = scanner.nextInt();

        System.out.println(lado*lado);

        int lado2 =((lado*lado));

        System.out.println("Dobro da area ao quadrado");

        System.out.println(lado2*2);

        scanner.close();
    }
}
