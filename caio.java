import java.util.Scanner;
public class caio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nuemro");
        Integer numero = scanner.nextInt();

        Integer cubo = numero*numero*numero;

        System.out.println(" O cubo do "+ numero + " é "+cubo);
        
        scanner.close();
    }
}
