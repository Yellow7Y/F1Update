import java.util.Scanner;
public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite á nota:");

        Integer numero = scanner.nextInt();

        System.out.println("Digite a segunda nota:");

        Integer num2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");

        Integer num3 = scanner.nextInt();

        System.out.println("Digite a quarta nota: ");

        Integer num4 = scanner.nextInt();

        System.out.println("Somas das notas: ");

        System.out.println(numero+num2+num3+num4); 

        Integer soma = numero+num2+num3+num4;

        System.out.println("Media das notas: ");

        System.out.println(soma/4);
        
        scanner.close();
    }
}
